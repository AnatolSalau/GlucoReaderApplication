import style from './TabNavButton.module.css'
import {useState} from "react";


function TabNavButton({children, text}) {
      let [isActive, setIsActive] = useState(false);

      const toggleActive = (event) => {
            setIsActive(!isActive);
      }

      const changeStyle = (isActive) => {
            return isActive ? style.tabNavButtonActive : style.tabNavButton;
      }
      return (
            <div
                  onClick={(e) => {
                       toggleActive(e) ;
                  }}
                  className={changeStyle(isActive)}
            >
                  {text}
                  <div className={style.svgWrapper}>
                        {children}
                  </div>
            </div>
      )
}

export default TabNavButton;