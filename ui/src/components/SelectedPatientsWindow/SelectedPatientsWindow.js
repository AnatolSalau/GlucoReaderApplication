import style from './SelectedPatientsWindow.module.css'
import PatientCard from "./PatientCard";
import TabsBar from "./TabsBar";
import { FiCamera } from 'react-icons/fi';

function SelectedPatientsWindow() {
      return (
            <div
                  className={style.selectedPatientsWindow}
            >     <TabsBar />
                  <PatientCard>
                        <FiCamera />
                  </PatientCard>
            </div>
      );
}

export default SelectedPatientsWindow;