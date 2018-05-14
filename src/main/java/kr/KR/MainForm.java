    JButton btnNewButton1 = new JButton("Для жилых помещений");
		JButton btnNewButton2 = new JButton("Для производственных помещений");
		/**
		 * Задание шрифта для кнопки 
		 */
		btnNewButton1.setFont(font);
		btnNewButton1.setIcon(icon2);
		/**
		 * указывает координаты верхней левой вершины кнопки, а также его ширину и высоту.
		 */
		btnNewButton1.setBounds(1, 10, 620, 100);
		/**
		 * отключение первоначального фокусирования на кнопке
		 */
		btnNewButton1.setFocusable(isDisplayable());
		/**
		 * Задание шрифта для кнопки 
		 */
		btnNewButton2.setFont(font);
		btnNewButton2.setIcon(icon3);
		/**
		 * указывает координаты верхней левой вершины кнопки, а также его ширину и высоту.
		 */
		btnNewButton2.setBounds(1,110, 620, 100);
		/**
		 * отключение первоначального фокусирования на кнопке
		 */
		btnNewButton2.setFocusable(isDisplayable());
		/**
		 * Добавление элементов на панель для кнопки
		 */
		Panel2.add(btnNewButton1);
		Panel2.add(btnNewButton2);
		/**
		 * Добавление элементов на главную панель
		 */
		contentPane.add(Panel2);
		/**
		 * Запрет на изменения размера окна
		 */
		setResizable(false);
		/**
		 * Установка названия окна
		 */
