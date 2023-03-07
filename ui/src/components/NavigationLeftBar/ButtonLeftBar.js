import { MdHomeFilled }
      from 'react-icons/md' ;
import style from './ButtonLeftBar.module.css'

function ButtonLeftBar({children}) {
      return (
            <button className={style.button}>
                  {children}
            </button>
      );
}

export default ButtonLeftBar;