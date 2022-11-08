package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            final int min = 32;
            final int max = 40;
            patientsTemperature[i] = Math.round(((float) (Math.random() * (max - min)) + min) * 100) / (float) 100;
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        int healthyPatients = 0;
        int count = 0;
        StringBuilder temp = new StringBuilder();
        float averageTemperature = 0;

        for (int j = 0; j < temperatureData.length; j++) {
            count++;
            averageTemperature = averageTemperature + temperatureData[j] / temperatureData.length;
            temp.append(temperatureData[j]).append(" ");
        }

        String resultAverageTemp = String.format("%.2f", averageTemperature);

        for (float temperatureHealthy : temperatureData) {
            if (temperatureHealthy >= 36.2f && temperatureHealthy <= 36.9f) {
                healthyPatients++;
            }
        }

        String report =
                "Температуры пациентов: " + temp.toString().trim() +
                "\nСредняя температура: " + resultAverageTemp +
                "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
