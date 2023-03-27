import { MdHomeFilled }
      from 'react-icons/md' ;
import { FiHome, FiUser, FiFolder, FiPrinter, FiArchive }
      from 'react-icons/fi' ;
import { BiLineChart }
      from 'react-icons/bi' ;
import { HiFolder }
      from 'react-icons/hi' ;
import style from './NavigationLeftBar.module.css'

import ButtonLeftBar from "./ButtonLeftBar";

function NavigationLefBar({switchWindowHandler, activeButtonName}) {
      return (
            <div
                  className={style.navigationLeftbar}
            >
                  <ButtonLeftBar
                        windowComponentName = "AllPatientsWindow"
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeButtonName}
                  >
                        <MdHomeFilled/>
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "SelectedPatientsWindow"
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeButtonName}
                  >
                        <FiUser/>
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "PatientResultsWindow"
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeButtonName}
                  >
                        <HiFolder />
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "ChartsWindow"
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeButtonName}
                  >
                        <BiLineChart/>
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "PrintWindow"
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeButtonName}
                  >
                        <FiPrinter/>
                  </ButtonLeftBar>
                  <ButtonLeftBar
                        windowComponentName = "SettingsWindows"
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeButtonName}
                  >
                        <FiArchive/>
                  </ButtonLeftBar>
            </div>
      );
}

export default NavigationLefBar;