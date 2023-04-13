import { FaUserPlus } from 'react-icons/fa' ;
import { ImSearch } from 'react-icons/im'
import { VscTriangleDown } from 'react-icons/vsc'

import style from './AllPatientsNavBar.module.css'
import Input from "../Input";
import Button from "../Button";
import InputWithoutText from "../InputWithoutText";
import Dropdown from "../Dropdown";
import {useState} from "react";

function AllPatientsNavBar() {
      const dropDownItems = ['Линейный график', 'Круговая диаграмма'];
      const [selectedItem, setSelectedItem] = useState(dropDownItems[0]);

      return (
            <div className={style.allPatientsNavBar}>
                  <Input
                        textInFront="Врач:"
                        placeholderText="Фамилия Имя Отчество"
                        inputWidth={350}
                  >
                        <VscTriangleDown />
                  </Input>
{/*                  <div className={style.dropDownWrapper}>
                        <div
                              className={style.dropDownWrapperText}
                        >
                              Врач:
                        </div>

                        <Dropdown
                              dropDownItems={dropDownItems}
                              selectedItem={selectedItem}
                              setSelectedItem = {setSelectedItem}
                        />
                  </div>*/}
                  <Button text="Добавить пациента">
                        <FaUserPlus />
                  </Button>
                  <InputWithoutText
                        placeholderText="Поиск..."
                        inputWidth={288}
                  >
                        <ImSearch />
                  </InputWithoutText>
            </div>
      )
}

export default AllPatientsNavBar;