import style from './PatientCard.module.css'
import Input from "../Input";
import {VscTriangleDown} from "react-icons/vsc";
import Button from "../Button";
import {FaUserPlus} from "react-icons/fa";
import {MdOutlineCalendarToday} from "react-icons/md";

function PatientCard({children}) {
      return (
            <div
                  className={style.patientCard}
            >
                  <div
                        className={style.cardContent}
                  >
                        <div className={style.firstRow}>
                              <div className={style.photo}>
                                    {children}
                              </div>
                              <div className={style.firstRowInputs}>
                                    <Input
                                          textInFront="Фамилия:"
                                          placeholderText="Сидоров"
                                          inputWidth={385}
                                    >
                                    </Input>
                                    <Input
                                          textInFront="Имя:"
                                          placeholderText="Петр"
                                          inputWidth={348}
                                    >
                                    </Input>
                                    <Input
                                          textInFront="Отчество:"
                                          placeholderText="Иванович"
                                          inputWidth={396}
                                    >
                                    </Input>
                              </div>
                              <div className={style.firstRowAgeGender}>
                                    <Input
                                          textInFront="Пол:"
                                          placeholderText="М"
                                          inputWidth={131}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <Input
                                          textInFront="Возраст:"
                                          placeholderText="100"
                                          inputWidth={165}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                              </div>
                        </div>
                        <div className={style.middleRow}>
                              <div className={style.innerRowStart}>
                                    Дата рождения:
                              </div>
                              <div className={style.innerRowStart}>
                                    <Input
                                          textInFront="День:"
                                          placeholderText="24"
                                          inputWidth={138}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <Input
                                          textInFront="Месяц:"
                                          placeholderText="Сентябрь"
                                          inputWidth={225}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <Input
                                          textInFront="Год:"
                                          placeholderText="100"
                                          inputWidth={165}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <MdOutlineCalendarToday fontSize={22}></MdOutlineCalendarToday>
                              </div>
                              <div className={style.innerRowBetween}>
                                    <Input
                                          textInFront="Адрес:"
                                          placeholderText="ул. Академика Сахарова"
                                          inputWidth={350}
                                    >
                                          <VscTriangleDown />
                                    </Input>

                                    <div className={style.innerRowEnd}>
                                          <Input
                                                textInFront="Квартира:"
                                                placeholderText="351а"
                                                inputWidth={177}
                                          >
                                          </Input>
                                          <Input
                                                textInFront="Телефон:"
                                                placeholderText="+375 25 111-11-11"
                                                inputWidth={250}
                                          >
                                          </Input>
                                    </div>

                              </div>
                        </div>
                        <div className={style.lastRow}>
                              <div className={style.innerRowBetween}>
                                    <Input
                                          textInFront="Номер карты:"
                                          placeholderText="100"
                                          inputWidth={250}
                                    >
                                    </Input>
                                    <Input
                                          textInFront="Примечание:"
                                          placeholderText="Общее состояние удовлетвортельное, посещение через месяц"
                                          inputWidth={600}
                                    >
                                    </Input>
                              </div>
                              <div className={style.innerRowEnd}>
                                    <div className={style.patientCardButtons}>
                                          <Button text="Сохранить">
                                                <FaUserPlus />
                                          </Button>
                                          <Button text="Поместить в архив">
                                                <FaUserPlus />
                                          </Button>
                                    </div>

                              </div>

                        </div>
                  </div>
            </div>
      )
}

export default PatientCard;