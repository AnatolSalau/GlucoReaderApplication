import {useEffect, useState} from "react";
import style from './Main.module.css'

import AllPatientsWindow from "./AllPatientsWindow/AllPatientsWindow";
import NavigationLefBar from "./NavigationLeftBar/NavigationLefBar";
import SelectedPatientsWindow from "./SelectedPatientsWindow/SelectedPatientsWindow";
import PatientResultsWindow from "./PatientResultsWindow/PatientResultsWindow";
import ChartsWindow from "./ChartsWindow/ChartsWindow";
import PrintWindow from "./PrintWindow/PrintWindow";
import SettingsWindows from "./SettingsWindows/SettingsWindows";



function Main() {

      let [activeWindowName, setActiveWindowName] = useState('AllPatientsWindow');
      console.log("Render Main")

      const switchWindowHandler = (activeWindowName) => {
            setActiveWindowName(activeWindowName);
      }
      
      const switchWindowRender = (activeWindowName) => {
            console.log('switchWindowRender function :' + activeWindowName)
            switch (activeWindowName) {
                  case 'AllPatientsWindow' : return <AllPatientsWindow />
                  case 'SelectedPatientsWindow' : return <SelectedPatientsWindow />
                  case 'PatientResultsWindow' : return <PatientResultsWindow />
                  case 'ChartsWindow' : return <ChartsWindow />
                  case 'PrintWindow' : return <PrintWindow />
                  case 'SettingsWindows' : return <SettingsWindows />
            }
      }

      return (
            <div className={style.main}>
                  <NavigationLefBar
                        switchWindowHandler={switchWindowHandler}
                        activeButtonName={activeWindowName}
                  />
                  {
                        switchWindowRender(activeWindowName)
                  }

            </div>
      )
}

export default Main;