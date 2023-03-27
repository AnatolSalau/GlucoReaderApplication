import {useState} from "react";
import style from './Tab.module.css'


function Tab({children, text}) {
      let [isActive, setIsActive] = useState(false);

      const toggleActive = (event) => {
            setIsActive(!isActive);
      }

      const changeStyle = (isActive) => {
            return isActive ? style.tabActive : style.tab;
      }

      return (
            <div
                  onClick={(e) => toggleActive(e)}
                  className={changeStyle(isActive)}
            >
                  {text}
                  <div className={style.svgWrapper}>
                        {children}
                  </div>
            </div>
      )
}

export default Tab;