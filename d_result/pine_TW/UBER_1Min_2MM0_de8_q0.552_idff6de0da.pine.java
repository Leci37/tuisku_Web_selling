//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: UBER_1Min_2MM0_ff6de0da Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2MM0_ff6de0da", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_ff6de0da(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Money_Flow_Ratio <= 0.271459 )
		if( Short_Long_Diff <= 0.04859 )
			if( Short_MA <= 63.0535 )
				if( MFI_Low <= -0.66031 )
					if( Typical_Price <= 58.8447 )
						ret := 0.900000 // buy
					if( Typical_Price > 58.8447 )
						if( MFI_High <= -69.5862 )
							if( Money_Flow_Ratio <= 0.071127 )
								if( Money_Flow_Ratio <= 0.036782 )
									ret := -0.060606
								if( Money_Flow_Ratio > 0.036782 )
									ret := -0.888889 // sell
							if( Money_Flow_Ratio > 0.071127 )
								if( Typical_Price <= 62.6764 )
									ret := 0.857143 // buy
								if( Typical_Price > 62.6764 )
									ret := -0.166667
						if( MFI_High > -69.5862 )
							if( Short_Long_Diff <= -0.241986 )
								if( MFI <= 14.0951 )
									ret := 1.000000 // buy
								if( MFI > 14.0951 )
									ret := -0.800000 // sell
							if( Short_Long_Diff > -0.241986 )
								if( Short_MA <= 61.4456 )
									ret := -0.179104
								if( Short_MA > 61.4456 )
									ret := -0.764151 // sell
				if( MFI_Low > -0.66031 )
					if( Money_Flow_Ratio <= 0.264968 )
						if( Long_MA <= 61.3675 )
							ret := 0.461538
						if( Long_MA > 61.3675 )
							ret := 0.916667 // buy
					if( Money_Flow_Ratio > 0.264968 )
						ret := -0.066667
			if( Short_MA > 63.0535 )
				if( Negative_Money_Flow <= 410.592 )
					if( Raw_Money_Flow <= 5.04216e+06 )
						if( Negative_Money_Flow_Sum <= 2.65071e+07 )
							if( Positive_Money_Flow <= 1.43639e+06 )
								if( Negative_Money_Flow_Sum <= 2.75108e+06 )
									ret := 0.093578
								if( Negative_Money_Flow_Sum > 2.75108e+06 )
									ret := -0.149140
							if( Positive_Money_Flow > 1.43639e+06 )
								if( Short_MA <= 74.0941 )
									ret := 0.487013
								if( Short_MA > 74.0941 )
									ret := -0.416667
						if( Negative_Money_Flow_Sum > 2.65071e+07 )
							if( MFI_Low <= -3.64042 )
								if( MFI_Low <= -12.3082 )
									ret := -0.285714
								if( MFI_Low > -12.3082 )
									ret := 0.088028
							if( MFI_Low > -3.64042 )
								if( MFI_High <= -62.7192 )
									ret := -0.634615
								if( MFI_High > -62.7192 )
									ret := -0.317073
					if( Raw_Money_Flow > 5.04216e+06 )
						if( Negative_Money_Flow_Sum <= 6.1437e+07 )
							if( MFI_High <= -62.6133 )
								ret := -0.500000
							if( MFI_High > -62.6133 )
								if( MFI_High <= -60.4552 )
									ret := -1.000000 // sell
								if( MFI_High > -60.4552 )
									ret := -0.708333 // sell
						if( Negative_Money_Flow_Sum > 6.1437e+07 )
							if( Short_MA <= 71.4527 )
								ret := 0.166667
							if( Short_MA > 71.4527 )
								ret := -0.500000
				if( Negative_Money_Flow > 410.592 )
					if( Raw_Money_Flow <= 348547 )
						if( Negative_Money_Flow_Sum <= 5.21471e+06 )
							if( Short_MA <= 72.7949 )
								if( Negative_Money_Flow <= 204957 )
									ret := 0.476718
								if( Negative_Money_Flow > 204957 )
									ret := 0.855263 // buy
							if( Short_MA > 72.7949 )
								if( MFI_Low <= -14.956 )
									ret := 0.736842 // buy
								if( MFI_Low > -14.956 )
									ret := -0.073620
						if( Negative_Money_Flow_Sum > 5.21471e+06 )
							if( Raw_Money_Flow <= 78154.6 )
								if( Short_MA <= 66.159 )
									ret := 0.519231
								if( Short_MA > 66.159 )
									ret := -0.251429
							if( Raw_Money_Flow > 78154.6 )
								if( MFI_High <= -78.1559 )
									ret := 0.725000 // buy
								if( MFI_High > -78.1559 )
									ret := 0.123894
					if( Raw_Money_Flow > 348547 )
						if( Negative_Money_Flow <= 7.77191e+06 )
							if( Short_MA <= 67.7213 )
								if( Short_Long_Diff <= -0.081545 )
									ret := 0.310997
								if( Short_Long_Diff > -0.081545 )
									ret := -0.117834
							if( Short_MA > 67.7213 )
								if( Raw_Money_Flow <= 5.25401e+06 )
									ret := 0.045103
								if( Raw_Money_Flow > 5.25401e+06 )
									ret := -0.278008
						if( Negative_Money_Flow > 7.77191e+06 )
							if( Negative_Money_Flow_Sum <= 4.79081e+07 )
								if( MFI <= 1.96199 )
									ret := 0.584906
								if( MFI > 1.96199 )
									ret := 0.060811
							if( Negative_Money_Flow_Sum > 4.79081e+07 )
								if( Short_Long_Diff <= 0.011249 )
									ret := 0.548544
								if( Short_Long_Diff > 0.011249 )
									ret := -0.125000
		if( Short_Long_Diff > 0.04859 )
			if( Positive_Money_Flow <= 16.5835 )
				if( MFI_High <= -63.3944 )
					if( Positive_Money_Flow_Sum <= 668971 )
						if( MFI_Low <= -17.1354 )
							if( Raw_Money_Flow <= 90330 )
								ret := -0.450000
							if( Raw_Money_Flow > 90330 )
								ret := 0.083333
						if( MFI_Low > -17.1354 )
							if( MFI_Low <= -6.88451 )
								if( Raw_Money_Flow <= 936461 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 936461 )
									ret := 1.000000 // buy
							if( MFI_Low > -6.88451 )
								if( Money_Flow_Ratio <= 0.175459 )
									ret := 0.533333
								if( Money_Flow_Ratio > 0.175459 )
									ret := 0.285714
					if( Positive_Money_Flow_Sum > 668971 )
						if( Long_MA <= 70.1061 )
							if( Negative_Money_Flow <= 1.64518e+06 )
								if( Positive_Money_Flow_Sum <= 2.46866e+06 )
									ret := -0.346154
								if( Positive_Money_Flow_Sum > 2.46866e+06 )
									ret := 0.642857
							if( Negative_Money_Flow > 1.64518e+06 )
								ret := -1.000000 // sell
						if( Long_MA > 70.1061 )
							if( MFI <= 7.326 )
								ret := 0.588235
							if( MFI > 7.326 )
								ret := -0.062500
				if( MFI_High > -63.3944 )
					if( MFI_High <= -61.4086 )
						if( Negative_Money_Flow <= 1.86453e+06 )
							ret := 0.100000
						if( Negative_Money_Flow > 1.86453e+06 )
							ret := -1.000000 // sell
					if( MFI_High > -61.4086 )
						if( Long_MA <= 70.9105 )
							if( Typical_Price <= 67.1307 )
								ret := 0.000000
							if( Typical_Price > 67.1307 )
								ret := -0.428571
						if( Long_MA > 70.9105 )
							ret := 0.363636
			if( Positive_Money_Flow > 16.5835 )
				if( Short_MA <= 62.9909 )
					if( Positive_Money_Flow <= 169506 )
						ret := 0.555556
					if( Positive_Money_Flow > 169506 )
						ret := 0.777778 // buy
				if( Short_MA > 62.9909 )
					if( MFI <= 20.8461 )
						if( Long_MA <= 69.3397 )
							if( Negative_Money_Flow <= 1000.27 )
								if( Short_MA <= 67.3677 )
									ret := -0.510638
								if( Short_MA > 67.3677 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 1000.27 )
								ret := -1.000000 // sell
						if( Long_MA > 69.3397 )
							if( Short_MA <= 70.6928 )
								if( Negative_Money_Flow_Sum <= 6.80932e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 6.80932e+06 )
									ret := 0.166667
							if( Short_MA > 70.6928 )
								if( MFI_High <= -75.6369 )
									ret := -0.230769
								if( MFI_High > -75.6369 )
									ret := -0.733333 // sell
					if( MFI > 20.8461 )
						ret := 0.400000
	if( Money_Flow_Ratio > 0.271459 )
		if( Negative_Money_Flow_Sum <= 600513 )
			if( Money_Flow_Ratio <= 0.798992 )
				if( MFI <= 33.2017 )
					if( MFI_Low <= 2.93663 )
						if( Negative_Money_Flow_Sum <= 400683 )
							if( MFI <= 22.4205 )
								if( Short_Long_Diff <= -0.029062 )
									ret := 0.750000 // buy
								if( Short_Long_Diff > -0.029062 )
									ret := -0.181818
							if( MFI > 22.4205 )
								ret := 0.857143 // buy
						if( Negative_Money_Flow_Sum > 400683 )
							if( Money_Flow_Ratio <= 0.291192 )
								if( Negative_Money_Flow <= 42853.2 )
									ret := 0.222222
								if( Negative_Money_Flow > 42853.2 )
									ret := -0.692308
							if( Money_Flow_Ratio > 0.291192 )
								ret := 0.789474 // buy
					if( MFI_Low > 2.93663 )
						if( Negative_Money_Flow <= 7968.99 )
							if( Negative_Money_Flow_Sum <= 355006 )
								if( MFI <= 27.0955 )
									ret := 0.621212
								if( MFI > 27.0955 )
									ret := 0.020202
							if( Negative_Money_Flow_Sum > 355006 )
								if( Positive_Money_Flow <= 68693.2 )
									ret := -0.390625
								if( Positive_Money_Flow > 68693.2 )
									ret := 0.296296
						if( Negative_Money_Flow > 7968.99 )
							if( Raw_Money_Flow <= 23698.9 )
								if( Typical_Price <= 66.4755 )
									ret := 0.285714
								if( Typical_Price > 66.4755 )
									ret := 0.634409
							if( Raw_Money_Flow > 23698.9 )
								if( Typical_Price <= 70.74 )
									ret := -0.062222
								if( Typical_Price > 70.74 )
									ret := 0.312000
				if( MFI > 33.2017 )
					if( Positive_Money_Flow_Sum <= 174502 )
						if( MA_Cross <= 36.3894 )
							if( MFI <= 38.5994 )
								if( Short_Long_Diff <= -0.006734 )
									ret := 0.544944
								if( Short_Long_Diff > -0.006734 )
									ret := 0.063830
							if( MFI > 38.5994 )
								if( Negative_Money_Flow <= 464.806 )
									ret := 0.367742
								if( Negative_Money_Flow > 464.806 )
									ret := 0.629870
						if( MA_Cross > 36.3894 )
							if( Short_MA <= 69.3328 )
								ret := 0.500000
							if( Short_MA > 69.3328 )
								ret := -0.833333 // sell
					if( Positive_Money_Flow_Sum > 174502 )
						if( Raw_Money_Flow <= 39022.4 )
							if( Negative_Money_Flow <= 26852.7 )
								if( Raw_Money_Flow <= 21956.9 )
									ret := 0.344473
								if( Raw_Money_Flow > 21956.9 )
									ret := -0.181159
							if( Negative_Money_Flow > 26852.7 )
								if( Negative_Money_Flow_Sum <= 562292 )
									ret := -0.546875
								if( Negative_Money_Flow_Sum > 562292 )
									ret := 0.866667 // buy
						if( Raw_Money_Flow > 39022.4 )
							if( Positive_Money_Flow_Sum <= 306961 )
								if( Positive_Money_Flow <= 86521.5 )
									ret := 0.289809
								if( Positive_Money_Flow > 86521.5 )
									ret := -0.238095
							if( Positive_Money_Flow_Sum > 306961 )
								if( Long_MA <= 63.7338 )
									ret := -0.100000
								if( Long_MA > 63.7338 )
									ret := 0.606481
			if( Money_Flow_Ratio > 0.798992 )
				if( Raw_Money_Flow <= 401713 )
					if( Positive_Money_Flow <= 8856.84 )
						if( Negative_Money_Flow_Sum <= 538769 )
							if( Raw_Money_Flow <= 18046.5 )
								if( Short_MA <= 71.225 )
									ret := 0.274493
								if( Short_MA > 71.225 )
									ret := 0.035985
							if( Raw_Money_Flow > 18046.5 )
								if( Negative_Money_Flow <= 7402.61 )
									ret := -0.211409
								if( Negative_Money_Flow > 7402.61 )
									ret := 0.098765
						if( Negative_Money_Flow_Sum > 538769 )
							if( Negative_Money_Flow_Sum <= 587917 )
								if( Money_Flow_Ratio <= 1.41133 )
									ret := 0.345679
								if( Money_Flow_Ratio > 1.41133 )
									ret := 0.740385 // buy
							if( Negative_Money_Flow_Sum > 587917 )
								if( Typical_Price <= 65.7203 )
									ret := 0.300000
								if( Typical_Price > 65.7203 )
									ret := -0.379310
					if( Positive_Money_Flow > 8856.84 )
						if( Negative_Money_Flow_Sum <= 563666 )
							if( Short_Long_Diff <= 0.397087 )
								if( Long_MA <= 56.1888 )
									ret := -0.787234 // sell
								if( Long_MA > 56.1888 )
									ret := -0.066430
							if( Short_Long_Diff > 0.397087 )
								if( Long_MA <= 74.4053 )
									ret := 0.666667
								if( Long_MA > 74.4053 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 563666 )
							if( Long_MA <= 66.6303 )
								if( Negative_Money_Flow_Sum <= 580794 )
									ret := 0.375000
								if( Negative_Money_Flow_Sum > 580794 )
									ret := -0.500000
							if( Long_MA > 66.6303 )
								if( Money_Flow_Ratio <= 0.858252 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.858252 )
									ret := 0.546875
				if( Raw_Money_Flow > 401713 )
					if( Long_MA <= 58.2206 )
						ret := 0.666667
					if( Long_MA > 58.2206 )
						if( MA_Cross <= 0.920372 )
							if( Short_MA <= 74.6182 )
								if( Positive_Money_Flow_Sum <= 1.31245e+06 )
									ret := -0.428571
								if( Positive_Money_Flow_Sum > 1.31245e+06 )
									ret := -0.049618
							if( Short_MA > 74.6182 )
								if( Long_MA <= 77.742 )
									ret := -0.754717 // sell
								if( Long_MA > 77.742 )
									ret := -0.428571
						if( MA_Cross > 0.920372 )
							if( MFI_Low <= 59.8709 )
								ret := -0.625000
							if( MFI_Low > 59.8709 )
								ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 600513 )
			if( Typical_Price <= 78.5172 )
				if( Positive_Money_Flow <= 612.695 )
					if( Money_Flow_Ratio <= 1.40909 )
						if( Negative_Money_Flow_Sum <= 4.98627e+06 )
							if( Short_MA <= 61.1149 )
								if( Long_MA <= 54.5801 )
									ret := 0.181818
								if( Long_MA > 54.5801 )
									ret := -0.551724
							if( Short_MA > 61.1149 )
								if( Typical_Price <= 61.468 )
									ret := 0.937500 // buy
								if( Typical_Price > 61.468 )
									ret := 0.149479
						if( Negative_Money_Flow_Sum > 4.98627e+06 )
							if( Negative_Money_Flow_Sum <= 2.34388e+07 )
								if( Negative_Money_Flow_Sum <= 1.3882e+07 )
									ret := -0.016863
								if( Negative_Money_Flow_Sum > 1.3882e+07 )
									ret := -0.104152
							if( Negative_Money_Flow_Sum > 2.34388e+07 )
								if( MFI <= 43.7053 )
									ret := 0.060759
								if( MFI > 43.7053 )
									ret := -0.026382
					if( Money_Flow_Ratio > 1.40909 )
						if( Long_MA <= 63.1742 )
							if( Short_Long_Diff <= 0.247495 )
								if( Raw_Money_Flow <= 1.37839e+06 )
									ret := -0.114286
								if( Raw_Money_Flow > 1.37839e+06 )
									ret := 0.276923
							if( Short_Long_Diff > 0.247495 )
								if( Short_MA <= 61.6181 )
									ret := 0.933333 // buy
								if( Short_MA > 61.6181 )
									ret := 0.648148
						if( Long_MA > 63.1742 )
							if( Positive_Money_Flow_Sum <= 1.14436e+06 )
								if( Typical_Price <= 70.5785 )
									ret := -0.437500
								if( Typical_Price > 70.5785 )
									ret := -0.909091 // sell
							if( Positive_Money_Flow_Sum > 1.14436e+06 )
								if( Negative_Money_Flow <= 239278 )
									ret := 0.220382
								if( Negative_Money_Flow > 239278 )
									ret := 0.018827
				if( Positive_Money_Flow > 612.695 )
					if( Raw_Money_Flow <= 1.80271e+07 )
						if( MFI_High <= 18.2851 )
							if( Short_Long_Diff <= 0.070165 )
								if( Positive_Money_Flow_Sum <= 258420 )
									ret := -0.736842 // sell
								if( Positive_Money_Flow_Sum > 258420 )
									ret := -0.014460
							if( Short_Long_Diff > 0.070165 )
								if( Money_Flow_Ratio <= 1.024 )
									ret := -0.312865
								if( Money_Flow_Ratio > 1.024 )
									ret := -0.113677
						if( MFI_High > 18.2851 )
							if( MFI_Low <= 79.1577 )
								if( Long_MA <= 69.8354 )
									ret := -0.464286
								if( Long_MA > 69.8354 )
									ret := -0.725490 // sell
							if( MFI_Low > 79.1577 )
								if( Positive_Money_Flow <= 20155.2 )
									ret := -0.555556
								if( Positive_Money_Flow > 20155.2 )
									ret := 0.235294
					if( Raw_Money_Flow > 1.80271e+07 )
						if( Negative_Money_Flow_Sum <= 1.48163e+07 )
							if( Negative_Money_Flow_Sum <= 1.27835e+07 )
								if( Long_MA <= 69.8401 )
									ret := 0.279070
								if( Long_MA > 69.8401 )
									ret := -0.416667
							if( Negative_Money_Flow_Sum > 1.27835e+07 )
								ret := 0.900000 // buy
						if( Negative_Money_Flow_Sum > 1.48163e+07 )
							if( MFI_High <= -1.02058 )
								if( MFI <= 74.8538 )
									ret := -0.349515
								if( MFI > 74.8538 )
									ret := 0.470588
							if( MFI_High > -1.02058 )
								if( Positive_Money_Flow_Sum <= 2.8601e+08 )
									ret := -0.794702 // sell
								if( Positive_Money_Flow_Sum > 2.8601e+08 )
									ret := 0.107143
			if( Typical_Price > 78.5172 )
				if( MFI_Low <= 62.5116 )
					if( Positive_Money_Flow <= 1.34396e+07 )
						if( Typical_Price <= 81.9958 )
							if( MFI_Low <= 56.8218 )
								if( Positive_Money_Flow_Sum <= 8.99868e+07 )
									ret := 0.275689
								if( Positive_Money_Flow_Sum > 8.99868e+07 )
									ret := -0.750000 // sell
							if( MFI_Low > 56.8218 )
								if( Long_MA <= 80.5696 )
									ret := 0.818182 // buy
								if( Long_MA > 80.5696 )
									ret := 1.000000 // buy
						if( Typical_Price > 81.9958 )
							if( Long_MA <= 86.4561 )
								if( Positive_Money_Flow_Sum <= 2.68014e+07 )
									ret := -0.114706
								if( Positive_Money_Flow_Sum > 2.68014e+07 )
									ret := 0.212860
							if( Long_MA > 86.4561 )
								ret := -0.782609 // sell
					if( Positive_Money_Flow > 1.34396e+07 )
						if( MFI_High <= -39.393 )
							ret := 0.083333
						if( MFI_High > -39.393 )
							if( MFI_Low <= 54.7547 )
								if( Positive_Money_Flow_Sum <= 9.46332e+07 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow_Sum > 9.46332e+07 )
									ret := 0.980392 // buy
							if( MFI_Low > 54.7547 )
								ret := 0.750000 // buy
				if( MFI_Low > 62.5116 )
					if( MFI <= 83.0941 )
						ret := -1.000000 // sell
					if( MFI > 83.0941 )
						if( MFI <= 85.0026 )
							ret := 0.187500
						if( MFI > 85.0026 )
							if( Short_Long_Diff <= 0.123959 )
								ret := 0.071429
							if( Short_Long_Diff > 0.123959 )
								if( Short_MA <= 84.6582 )
									ret := -1.000000 // sell
								if( Short_MA > 84.6582 )
									ret := -0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_UBER_1Min_ff6de0da(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


