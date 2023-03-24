import React, {useContext} from 'react';
import { CartContext } from '../../Context/cart-context'
import styles from './Card.module.css';

const Card = ({id, name, price, imageUrl}) => {
  const { isItemInCart, addItem, removeItem } = useContext(CartContext)

  const isInCart = isItemInCart(id)
  const addToCart = () => addItem(id)
  const removeFromCart = () => removeItem(id)
  return (
    
      <div className={styles.card}>
        <img className={styles.img} src={imageUrl} alt={name} title={name} />
        <h2 className={styles.h2}>{name}</h2>
        <p className={styles.p}>£ {price.toFixed(2)}</p>
        <button
        onClick={isInCart ? removeFromCart : addToCart} 
        className={styles[isInCart ? 'remove-from-cart' : 'add-to-cart']}
          >
            {isInCart ? 'In cart' : 'Add to cart'}
        </button>
      </div>
  )
}

export default Card