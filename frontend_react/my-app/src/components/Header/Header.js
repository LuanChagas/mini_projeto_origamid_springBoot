import React from "react";
import { NavLink } from "react-router-dom";
import styles from "./Header.module.css";

const Header = () => {
  return (
    <nav className={styles.header}>
      <ul>
        <li>
          <NavLink
            exact={true}
            activeClassName={styles.active}
            className={styles.link}
            to="/"
          >
            Produto
          </NavLink>
        </li>
        <li>
          <NavLink
            exact={true}
            activeClassName={styles.active}
            className={styles.link}
            to="contato"
          >
            contato
          </NavLink>
        </li>
      </ul>
    </nav>
  );
};

export default Header;
