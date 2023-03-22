import React from "react";
import styles from './Nav.module.css';
import { Link } from "react-router-dom";

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
      </ul>
    </div>
  );
};

export default Nav;
