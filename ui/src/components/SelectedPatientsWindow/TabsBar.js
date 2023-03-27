
import { HiOutlineChevronLeft, HiOutlineChevronRight, HiOutlineX } from 'react-icons/hi' ;
import style from './TabsBar.module.css'
import Tab from './Tab'
import TabNavButton from "./TabNavButton";


function TabsBar() {
      return (
            <div
                  className={style.tabsBar}
            >
                  <TabNavButton>
                        <HiOutlineChevronLeft />
                  </TabNavButton>
                  <div className={style.tabsWrapper}>
                        <Tab
                              text="Иванов Иван Иванович"
                        >
                              <HiOutlineX />
                        </Tab>
                        <Tab
                              text="Иванов Иван Иванович"
                        >
                              <HiOutlineX />
                        </Tab>
                        <Tab
                              text="Иванов Иван Иванович"
                        >
                              <HiOutlineX />
                        </Tab>
                  </div>
                  <TabNavButton>
                        <HiOutlineChevronRight />
                  </TabNavButton>
            </div>
      );
}

export default TabsBar;