
import style from './ButtonLeftBar.module.css'
import {useState} from "react";

function ButtonLeftBar({children, windowComponentName}) {

      let [isActive, setIsActive] = useState(false);

      return (
            <button
                  className={style.button}
            >
                  {children}
            </button>
      );
}

export default ButtonLeftBar;