import React, { useState, useEffect } from "react";
import { Spin, Typography } from "antd";
import PageHeader from "../components/PageHeader";
import { requestToApi } from "../components/Request";

const { Text } = Typography;

export default function ServerName() {
    const [serverInfo, setServerInfo] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchServerInfo = async () => {
            try {
                const data = await requestToApi.get("/api/v1/apps/info");
                console.log("Ответ API:", data);
                setServerInfo(data);
            } finally {
                setLoading(false);
            }
        };

        fetchServerInfo();
    }, []);

    return (
        <div>
            <PageHeader title={"Информация о сервере"} />
            {loading ? (
                <Spin tip="Загрузка данных..." style={{ marginTop: 20 }} />
            ) : serverInfo ? (
                <div style={{ marginTop: 20 }}>
                    <Text strong>Имя сервера:</Text> {serverInfo.applicationName}
                    <br />
                    <Text strong>Порт сервера:</Text> {serverInfo.serverPort}
                </div>
            ) : (
                <Text>Данные о сервере недоступны.</Text>
            )}
        </div>
    );
}