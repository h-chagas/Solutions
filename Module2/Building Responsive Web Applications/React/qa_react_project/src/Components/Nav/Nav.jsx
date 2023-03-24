import React from "react";
import { Link } from "react-router-dom";
import styles from './Nav.module.css';

const Nav = () => {
  return (
    <div className={styles.nav}>
      <ul className={styles.ul}>
        <li className={styles.li}>
          <Link to="/"> Home </Link>
        </li>
        <li className="li">
          <Link to="/shop"> Shop </Link>
        </li>
        <li className="li">
          <Link to="/checkout"> Checkout </Link>
        </li>
      </ul>
    </div>
  );
};

export default Nav;
