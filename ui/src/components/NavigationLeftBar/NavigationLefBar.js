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
                  <ButtonLeftBar icon={MdHomeFilled()}/>
                  <ButtonLeftBar icon={FiUser()}/>
                  <ButtonLeftBar icon={FiFolder()}/>
                  <ButtonLeftBar icon={BiLineChart()}/>
                  <ButtonLeftBar icon={FiPrinter()}/>
                  <ButtonLeftBar icon={FiArchive()}/>
            </div>
      );
}

export default NavigationLefBar;