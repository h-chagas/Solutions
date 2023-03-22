import React from 'react';
import Card from '../Card/Card';
import styles from './CardsArea.module.css';
import db from '../../db.json'

const CardsArea = ({imageUrl, name, price}) => {
  const plantsCards = db.map((plant) => {
    return (
      <Card
        name={plant.name}
        price={plant.price}
        imageUrl={plant.imageUrl}
        key={plant.id}
     />
    )
  })
  return (
    <div className={styles.cardsArea}>
        {plantsCards}
    </div>
  )
}

export default CardsArea