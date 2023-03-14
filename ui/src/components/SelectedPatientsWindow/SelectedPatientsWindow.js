import style from './SelectedPatientsWindow.module.css'
import PatientCard from "./PatientCard";
import TabsBar from "./TabsBar";

function SelectedPatientsWindow() {
      return (
            <div
                  className={style.selectedPatientsWindow}
            >     <TabsBar />
                  <PatientCard />
            </div>
      );
}

export default SelectedPatientsWindow;