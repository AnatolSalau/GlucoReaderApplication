import { MdHomeFilled }
      from 'react-icons/md' ;
import { FiHome, FiUser, FiFolder, FiPrinter, FiArchive }
      from 'react-icons/fi' ;
import { BiLineChart }
      from 'react-icons/bi' ;




import style from './NavigationLeftBar.module.css'

import ButtonLeftBar from "./ButtonLeftBar";

function NavigationLefBar() {
      return (
            <div className={style.navigationLeftbar}>
                  <ButtonLeftBar><MdHomeFilled/></ButtonLeftBar>
                  <ButtonLeftBar><FiUser/></ButtonLeftBar>
                  <ButtonLeftBar><BiLineChart/></ButtonLeftBar>
                  <ButtonLeftBar><FiPrinter/></ButtonLeftBar>
                  <ButtonLeftBar><FiArchive/></ButtonLeftBar>
            </div>
      );
}

export default NavigationLefBar;