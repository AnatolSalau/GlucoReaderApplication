import style from './Main.module.css'
import AllPatientsWindow from "./AllPatientsWindow/AllPatientsWindow";
import NavigationLefBar from "./NavigationLeftBar/NavigationLefBar";
import SelectedPatientsWindow from "./SelectedPatientsWindow/SelectedPatientsWindow";
import {useEffect, useState} from "react";

function Main() {

      let [activeWindowName, setActiveWindowName] = useState('');
      console.log("Render Main")

      const switchWindowHandler = (activeWindowName) => {
            setActiveWindowName(activeWindowName);
      }
      
      const switchWindowRender = (activeWindowName) => {
            switch (activeWindowName) {
                  case 'AllPatientsWindow' : return <AllPatientsWindow />
                  case 'SelectedPatientsWindow' : return <SelectedPatientsWindow />
                  default : return <AllPatientsWindow />
            }
      }

      return (
            <div className={style.main}>
                  <NavigationLefBar
                        switchWindowHandler={switchWindowHandler}
                  />
                  {
                        switchWindowRender(activeWindowName)
                  }

            </div>
      )
}

export default Main;