	public void actionPerformed(ActionEvent e)  {
		try {
		/**
		 * Создание объекта прослушивающего нажатие кнопок.
		 */
        Object src = e.getSource();
        /**
    	 *Условие для прослушиваемой кнопки.
    	 */
        if (src == ComponentForm.btnNewButton){
        	/**
        	 * Считывание введенно максимальной мощности.
        	 */
			k1=Float.parseFloat((ComponentForm.TxtBox1.getText( )));
