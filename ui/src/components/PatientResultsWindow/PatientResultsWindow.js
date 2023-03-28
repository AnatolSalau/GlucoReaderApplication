import style from './PatientResultsWindow.module.css'
import Input from "../Input";
import {VscTriangleDown} from "react-icons/vsc";
import PatientResultTable from "./PatientResultTable";

function PatientResultsWindow() {
      return(
            <div
                  className={style.patientsResult}
            >
                  <div className={style.wrapper}>
                        <div className={style.navBar}>
                              <Input
                                    textInFront="Ф.И.О пациента: "
                                    placeholderText="Фамилия Имя Отчество"
                                    inputWidth={436}
                              >
                                    <VscTriangleDown />
                              </Input>
                              <Input
                                    textInFront="Возраст:"
                                    placeholderText="49"
                                    inputWidth={165}
                              >
                              </Input>
                        </div>
                        <PatientResultTable />
                  </div>
            </div>
      )
}

export default PatientResultsWindow;