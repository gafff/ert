/**
		 * Добавляем кнопку, текстовые поля и метки на панель
		 */
		Panel1.add(label_1);
		label_1.setBounds(50, 80, 350, 20);
        Panel1.add(TxtBox1);
        TxtBox1.setBounds(100, 200, 150, 100);
        Panel1.add(label_2);
        Panel1.add(TxtBox2);
        TxtBox2.setBounds(50, 80, 350, 20);
		TxtBox2.disable();
        Panel1.add(btnNewButton);
        btnNewButton.setBounds(50, 20, 140, 40);
        Panel1.add(label_3);
        /**
		 * Помещаем панель на главный фрейм
		 */
		frame = new JFrame("Для жилых помещений");
		frame.setContentPane(Panel1);
		frame.setBounds(300,15,500,160);
		/**
		 * Отображаем окно
		 */
		frame.setVisible(true);
		/**
		 * Запрещаем масштабировать окно
		 */
		frame.setResizable(false);
		/**
		 * Добавляем иконку
		 */
