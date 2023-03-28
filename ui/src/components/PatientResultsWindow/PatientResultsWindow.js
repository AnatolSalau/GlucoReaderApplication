import style from './PatientResultsWindow.module.css'
import Input from "../Input";
import {VscTriangleDown} from "react-icons/vsc";

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
                        <div className={style.patientsResultTable}>

                        </div>
                  </div>
            </div>
      )
}

export default PatientResultsWindow;