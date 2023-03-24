import React from 'react';
import Card from '../Card/Card';
import styles from './CardsArea.module.css';

const CardsArea = ({plantApi}) => {
  const plantsCards = plantApi.map((plant) => {
    return (
      <Card
        {...plant}
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