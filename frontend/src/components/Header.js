import React from 'react';
import { useNavigate } from "react-router-dom";
import {Button, Image, Menu, MenuProps} from "antd";
import {UserOutlined} from "@ant-design/icons";
import {requestToApi} from "./Request";

const Header = ()=>{
    const itemsPublic =[
        {
            label: <div style={{fontSize:"1.5em"}}>Сайт</div>
        }
    ]

    return(
        <div style={{backgroundColor: "green"}}>
            <Menu mode={"horizontal"} items={itemsPublic} style={{backgroundColor: "green"}}/>
        </div>
    )
}
export default Header;