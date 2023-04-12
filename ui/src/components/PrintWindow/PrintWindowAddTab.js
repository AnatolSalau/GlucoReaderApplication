import style from './PrintWindowAddTab.module.css'
import {FiPlus} from "react-icons/fi";

function PrintWindowAddTab() {
      return (
            <div className={style.printWindowAddTab}>
                  <div className={style.svgWrapper}>
                        <FiPlus />
                  </div>
            </div>
      )
      
}

export default PrintWindowAddTab;