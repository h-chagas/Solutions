import React from 'react';
import styles from './Card.module.css';

const Card = ({imageUrl, name, price}) => {
  return (
    
      <div className={styles.card}>
        <img className={styles.img} src={imageUrl} alt="plant" />
        <h2 className={styles.h2}>{name}</h2>
        <p className={styles.p}>£ {price.toFixed(2)}</p>
        <input className={styles.btn} type="button" value="Add to cart" />
      </div>
    
  )
}

export default Card