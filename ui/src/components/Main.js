import style from './Main.module.css'
import AllPatientsWindow from "./AllPatientsWindow/AllPatientsWindow";
import NavigationLefBar from "./NavigationLeftBar/NavigationLefBar";
import SelectedPatientsWindow from "./SelectedPatientsWindow/SelectedPatientsWindow";

function Main() {
      return (
            <div className={style.main}>
                  <NavigationLefBar />
{/*                  <AllPatientsWindow />*/}
                  <SelectedPatientsWindow />
            </div>
      )
}
export default Main;