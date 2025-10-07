-- Validate appointment booking
SELECT * FROM appointments WHERE patient_id = 'P123' AND date = '2025-10-10';

-- Validate billing records
SELECT * FROM billing WHERE patient_id = 'P123' AND status = 'paid';
