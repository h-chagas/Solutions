import React from "react";
import { Link } from 'react-router-dom'
import home_image from "../assets/images/home_page_img.jpeg";
import styles from './Home.module.css'

const Home = () => {
  return (
    <div className={styles.home}>
      <div className={styles.firstContainer}>
        <h2 className={styles.h2}>Bring your home to life.</h2>
        <p className={styles.p}>
          Elevate your living space with a touch of nature. <br /> We offer a
          range of easy-care houseplants
        </p>
        <div className={styles.divBtn}>
          <Link to="/shop" className={styles.btn}> Browse plants </Link>
        </div>
      </div>
      <img
        className={styles.img}
        src={home_image}
        alt="living room with many plants"
      />
    </div>
  );
};

export default Home;
