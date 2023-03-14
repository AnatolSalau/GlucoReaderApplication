
import style from './ButtonLeftBar.module.css'
import {useState} from "react";

function ButtonLeftBar({children, switchWindowHandler, windowComponentName}) {

      return (
            <button
                  onClick={() => {switchWindowHandler(windowComponentName)}}
                  className={style.button}
            >
                  {children}
            </button>
      );
}

export default ButtonLeftBar;