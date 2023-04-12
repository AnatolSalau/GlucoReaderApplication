import style from './PrintWIndowTab.module.css'
import {HiOutlineX} from "react-icons/hi";

function PrintWindowTab({children, text}) {
    return (
          <div className={style.printWindowTab}>
                {children}
                {text}
                <div className={style.svgWrapper}>
                      <HiOutlineX />
                </div>
          </div>
    );
}

export default PrintWindowTab;