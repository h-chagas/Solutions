import React, {useState} from 'react';
import styles from './Card.module.css';

const Card = ({id, name, price, imageUrl}) => {
  const [isActive, setIsActive] = useState(false);
  
  
  function toggleClass() {
    setIsActive(!isActive)
  }

  return (
    
      <div className={styles.card}>
        <img className={styles.img} src={imageUrl} alt="plant" />
        <h2 className={styles.h2}>{name}</h2>
        <p className={styles.p}>£ {price.toFixed(2)}</p>
        <input 
        className={isActive ? styles.btnClicked : styles.btn} 
        onClick={toggleClass} 
        type="button" 
        value={isActive ? "In Cart" : "Add to Cart"}
        /> 
      </div>
    
  )
}

export default Card