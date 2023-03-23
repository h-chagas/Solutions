import React from 'react'
import CardsArea from '../Components/CardsArea/CardsArea'
import styles from './Shop.module.css'

const Shop = ({plantApi}) => {
  return (
    <>
      <h2 className={styles.ourPlants}>Our plants</h2>
      <div className={styles.Shop}>
        <CardsArea plantApi={plantApi} />
      </div>
    </>
  )
}

export default Shop