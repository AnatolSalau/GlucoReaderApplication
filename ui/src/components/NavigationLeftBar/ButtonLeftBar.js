import { MdHomeFilled }
      from 'react-icons/md' ;
import style from './ButtonLeftBar.module.css'

function ButtonLeftBar({icon}) {
      return (
            <button className={style.button}>
                  {icon}
            </button>
      );
}

export default ButtonLeftBar;