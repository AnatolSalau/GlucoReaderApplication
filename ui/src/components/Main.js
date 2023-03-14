import {useEffect, useState} from "react";
import style from './Main.module.css'

import AllPatientsWindow from "./AllPatientsWindow/AllPatientsWindow";
import NavigationLefBar from "./NavigationLeftBar/NavigationLefBar";
import SelectedPatientsWindow from "./SelectedPatientsWindow/SelectedPatientsWindow";
import PatientResultWindow from "./PatientResultWindow/PatientResultWindow";



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
                  case 'PatientResultWindow' : return <PatientResultWindow />
                  default : return <AllPatientsWindow />
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