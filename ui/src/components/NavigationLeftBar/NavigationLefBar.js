import { MdHomeFilled }
      from 'react-icons/md' ;
import { FiHome, FiUser, FiFolder, FiPrinter, FiArchive }
      from 'react-icons/fi' ;
import { BiLineChart }
      from 'react-icons/bi' ;
import style from './NavigationLeftBar.module.css'

import ButtonLeftBar from "./ButtonLeftBar";

function NavigationLefBar({switchWindowHandler}) {

      return (
            <div
                  className={style.navigationLeftbar}
            >
                  <ButtonLeftBar
                        windowComponentName = "AllPatientsWindow"
                        switchWindowHandler={switchWindowHandler}
                  >
                        <MdHomeFilled/>
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "SelectedPatientsWindow"
                        switchWindowHandler={switchWindowHandler}
                  >
                        <FiUser/>
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "SearchPatientName"
                  >
                        <BiLineChart/>
                  </ButtonLeftBar>
                  <ButtonLeftBar><FiPrinter/></ButtonLeftBar>
                  <ButtonLeftBar><FiArchive/></ButtonLeftBar>
            </div>
      );
}

export default NavigationLefBar;