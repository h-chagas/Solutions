import React, { createContext, useState } from "react";
import { sum } from 'lodash';

export const CartContext = createContext();

export const CartProvider = ({ plantApi, children }) => {
  const [itemIds, setItemIds] = useState([]);

  const contextValue = {
    itemIds,
    addItem(itemId) {
      setItemIds(oldItems => [...oldItems, itemId])
    },
    removeItem(itemId){
      setItemIds(oldItems => oldItems.filter((id) => id !== itemId))
    },
    isItemInCart(itemId){
      return !!itemIds.find((id) => id === itemId)
    },
    getItemById(itemId) {
      return plantApi.find((item) => item.id === itemId)
    },
    calculateTotal() {
      return sum(itemIds.map((id) => contextValue.getItemById(id).price))
    }
  }

  return (
  <CartContext.Provider value={contextValue}>
    {children}
  </CartContext.Provider>

  )
};
