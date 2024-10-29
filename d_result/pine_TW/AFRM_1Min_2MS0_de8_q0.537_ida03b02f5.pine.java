//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AFRM_1Min_2MS0_a03b02f5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2MS0_a03b02f5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_a03b02f5(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 61141.1 )
		if( Positive_Money_Flow <= 691.048 )
			if( MFI_Low <= -19.364 )
				if( rsi1 <= 6.32545 )
					ret := -0.800000 // sell
				if( rsi1 > 6.32545 )
					ret := -0.222222
			if( MFI_Low > -19.364 )
				if( rsi1 <= 46.6974 )
					if( Typical_Price <= 30.3677 )
						if( Raw_Money_Flow <= 13124.4 )
							if( k <= 22.5167 )
								if( Money_Flow_Ratio <= 0.159989 )
									ret := 0.636364
								if( Money_Flow_Ratio > 0.159989 )
									ret := 0.926316 // buy
							if( k > 22.5167 )
								if( Negative_Money_Flow <= 32.4152 )
									ret := 0.428571
								if( Negative_Money_Flow > 32.4152 )
									ret := 0.783505 // buy
						if( Raw_Money_Flow > 13124.4 )
							if( rsi1 <= 44.7655 )
								if( Money_Flow_Ratio <= 0.237565 )
									ret := 0.700855 // buy
								if( Money_Flow_Ratio > 0.237565 )
									ret := 0.257143
							if( rsi1 > 44.7655 )
								ret := -0.133333
					if( Typical_Price > 30.3677 )
						if( MFI_High <= -47.623 )
							if( smoothD_d <= 23.4306 )
								if( Negative_Money_Flow <= 216741 )
									ret := 0.567442
								if( Negative_Money_Flow > 216741 )
									ret := -0.214286
							if( smoothD_d > 23.4306 )
								if( Money_Flow_Ratio <= 0.176044 )
									ret := 0.276119
								if( Money_Flow_Ratio > 0.176044 )
									ret := -0.219178
						if( MFI_High > -47.623 )
							if( Raw_Money_Flow <= 5855.36 )
								ret := 0.250000
							if( Raw_Money_Flow > 5855.36 )
								if( rsi1 <= 36.6684 )
									ret := 0.727273 // buy
								if( rsi1 > 36.6684 )
									ret := 0.978723 // buy
				if( rsi1 > 46.6974 )
					if( rsi1 <= 54.9208 )
						if( smoothD_d <= 38.6855 )
							if( Negative_Money_Flow <= 7473.24 )
								if( smoothD_d <= 23.1402 )
									ret := -0.312500
								if( smoothD_d > 23.1402 )
									ret := 0.428571
							if( Negative_Money_Flow > 7473.24 )
								if( MFI_Low <= -0.507302 )
									ret := 1.000000 // buy
								if( MFI_Low > -0.507302 )
									ret := 0.400000
						if( smoothD_d > 38.6855 )
							if( MFI_High <= -46.6264 )
								if( k <= 81.4558 )
									ret := 0.182692
								if( k > 81.4558 )
									ret := -0.333333
							if( MFI_High > -46.6264 )
								if( Typical_Price <= 30.9702 )
									ret := -0.482759
								if( Typical_Price > 30.9702 )
									ret := 0.300000
					if( rsi1 > 54.9208 )
						if( d_k <= -7.30082 )
							if( Typical_Price <= 29.335 )
								ret := 0.727273 // buy
							if( Typical_Price > 29.335 )
								ret := -0.176471
						if( d_k > -7.30082 )
							if( Negative_Money_Flow_Sum <= 84048.3 )
								if( Typical_Price <= 27.0659 )
									ret := 0.750000 // buy
								if( Typical_Price > 27.0659 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 84048.3 )
								if( Money_Flow_Ratio <= 0.376543 )
									ret := 0.680000
								if( Money_Flow_Ratio > 0.376543 )
									ret := 0.153846
		if( Positive_Money_Flow > 691.048 )
			if( MFI <= 32.9498 )
				if( MFI_Low <= 7.54103 )
					if( smoothK_k <= 27.5704 )
						if( d_k <= -6.11235 )
							if( d <= 17.7205 )
								if( Positive_Money_Flow <= 6530.14 )
									ret := 0.083333
								if( Positive_Money_Flow > 6530.14 )
									ret := -0.875000 // sell
							if( d > 17.7205 )
								ret := -1.000000 // sell
						if( d_k > -6.11235 )
							if( Negative_Money_Flow <= 455.494 )
								if( Positive_Money_Flow <= 10448.3 )
									ret := 0.133333
								if( Positive_Money_Flow > 10448.3 )
									ret := -0.264151
							if( Negative_Money_Flow > 455.494 )
								if( Negative_Money_Flow <= 3001.17 )
									ret := 0.875000 // buy
								if( Negative_Money_Flow > 3001.17 )
									ret := 0.090909
					if( smoothK_k > 27.5704 )
						if( Raw_Money_Flow <= 18726.4 )
							if( Negative_Money_Flow_Sum <= 1.03433e+06 )
								if( d_k <= -6.85672 )
									ret := 0.500000
								if( d_k > -6.85672 )
									ret := 0.070866
							if( Negative_Money_Flow_Sum > 1.03433e+06 )
								ret := -0.800000 // sell
						if( Raw_Money_Flow > 18726.4 )
							ret := 0.900000 // buy
				if( MFI_Low > 7.54103 )
					if( Typical_Price <= 29.0737 )
						if( MFI_High <= -51.2072 )
							ret := 0.600000
						if( MFI_High > -51.2072 )
							if( Raw_Money_Flow <= 11318.9 )
								ret := 0.833333 // buy
							if( Raw_Money_Flow > 11318.9 )
								ret := 1.000000 // buy
					if( Typical_Price > 29.0737 )
						if( rsi1 <= 46.5824 )
							ret := 0.615385
						if( rsi1 > 46.5824 )
							ret := -0.304348
			if( MFI > 32.9498 )
				if( smoothK_k <= 34.9293 )
					if( Money_Flow_Ratio <= 0.827585 )
						if( d <= 19.0268 )
							ret := 0.222222
						if( d > 19.0268 )
							ret := -0.666667
					if( Money_Flow_Ratio > 0.827585 )
						ret := 0.500000
				if( smoothK_k > 34.9293 )
					if( Positive_Money_Flow <= 14181.9 )
						if( k <= 72.8785 )
							if( d_k <= 2.87839 )
								if( k <= 53.4215 )
									ret := -0.825000 // sell
								if( k > 53.4215 )
									ret := -1.000000 // sell
							if( d_k > 2.87839 )
								ret := -0.466667
						if( k > 72.8785 )
							ret := -0.333333
					if( Positive_Money_Flow > 14181.9 )
						ret := 0.000000
	if( Positive_Money_Flow_Sum > 61141.1 )
		if( rsi1 <= 51.3736 )
			if( Negative_Money_Flow <= 63169.4 )
				if( Positive_Money_Flow_Sum <= 304707 )
					if( d_k <= 4.05321 )
						if( Typical_Price <= 28.6461 )
							if( d_k <= -10.9318 )
								if( rsi1 <= 43.6089 )
									ret := 0.285714
								if( rsi1 > 43.6089 )
									ret := -0.430556
							if( d_k > -10.9318 )
								if( rsi1 <= 46.9938 )
									ret := 0.492600
								if( rsi1 > 46.9938 )
									ret := 0.043956
						if( Typical_Price > 28.6461 )
							if( Raw_Money_Flow <= 48569.6 )
								if( MFI_Low <= 24.6898 )
									ret := 0.021019
								if( MFI_Low > 24.6898 )
									ret := 0.166667
							if( Raw_Money_Flow > 48569.6 )
								if( Positive_Money_Flow <= 72812.4 )
									ret := -0.249221
								if( Positive_Money_Flow > 72812.4 )
									ret := 0.028369
					if( d_k > 4.05321 )
						if( MFI_Low <= 49.1055 )
							if( k <= 69.2283 )
								if( Positive_Money_Flow_Sum <= 79255.9 )
									ret := 0.112853
								if( Positive_Money_Flow_Sum > 79255.9 )
									ret := 0.343403
							if( k > 69.2283 )
								if( Raw_Money_Flow <= 43349.8 )
									ret := -0.011364
								if( Raw_Money_Flow > 43349.8 )
									ret := -0.769231 // sell
						if( MFI_Low > 49.1055 )
							if( d_k <= 5.34465 )
								ret := 0.000000
							if( d_k > 5.34465 )
								if( Positive_Money_Flow <= 11276.9 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow > 11276.9 )
									ret := 0.411765
				if( Positive_Money_Flow_Sum > 304707 )
					if( Positive_Money_Flow <= 156.496 )
						if( MFI <= 88.0592 )
							if( Negative_Money_Flow_Sum <= 55739.5 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 55739.5 )
								if( Raw_Money_Flow <= 18410.8 )
									ret := 0.304196
								if( Raw_Money_Flow > 18410.8 )
									ret := 0.041633
						if( MFI > 88.0592 )
							if( MFI_Low <= 76.6237 )
								if( k <= 57.5564 )
									ret := 0.434783
								if( k > 57.5564 )
									ret := 0.831169 // buy
							if( MFI_Low > 76.6237 )
								if( MFI <= 97.4681 )
									ret := -0.454545
								if( MFI > 97.4681 )
									ret := 0.529412
					if( Positive_Money_Flow > 156.496 )
						if( Negative_Money_Flow_Sum <= 298724 )
							if( Negative_Money_Flow_Sum <= 165477 )
								if( smoothD_d <= 19.5667 )
									ret := 0.375000
								if( smoothD_d > 19.5667 )
									ret := -0.188811
							if( Negative_Money_Flow_Sum > 165477 )
								if( rsi1 <= 43.804 )
									ret := -0.112676
								if( rsi1 > 43.804 )
									ret := -0.666667
						if( Negative_Money_Flow_Sum > 298724 )
							if( Negative_Money_Flow_Sum <= 533569 )
								if( Positive_Money_Flow_Sum <= 797515 )
									ret := 0.608295
								if( Positive_Money_Flow_Sum > 797515 )
									ret := -0.067227
							if( Negative_Money_Flow_Sum > 533569 )
								if( k <= 39.8975 )
									ret := -0.024533
								if( k > 39.8975 )
									ret := 0.080797
			if( Negative_Money_Flow > 63169.4 )
				if( d_k <= -23.3566 )
					if( d <= 32.017 )
						ret := -0.150000
					if( d > 32.017 )
						if( MFI_High <= -44.739 )
							if( Money_Flow_Ratio <= 0.357613 )
								if( smoothK_k <= 66.623 )
									ret := 0.461538
								if( smoothK_k > 66.623 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.357613 )
								if( smoothK_k <= 75.8521 )
									ret := 1.000000 // buy
								if( smoothK_k > 75.8521 )
									ret := 0.722222 // buy
						if( MFI_High > -44.739 )
							if( MFI <= 42.6608 )
								ret := 0.000000
							if( MFI > 42.6608 )
								if( d_k <= -26.1954 )
									ret := 0.066667
								if( d_k > -26.1954 )
									ret := 0.566667
				if( d_k > -23.3566 )
					if( smoothK_k <= 73.6933 )
						if( Positive_Money_Flow_Sum <= 91028.1 )
							if( rsi1 <= 29.432 )
								if( smoothK_k <= 4.09389 )
									ret := 0.378378
								if( smoothK_k > 4.09389 )
									ret := 0.755556 // buy
							if( rsi1 > 29.432 )
								if( smoothD_d <= 17.241 )
									ret := 0.952381 // buy
								if( smoothD_d > 17.241 )
									ret := 0.185567
						if( Positive_Money_Flow_Sum > 91028.1 )
							if( Money_Flow_Ratio <= 2.81148 )
								if( Positive_Money_Flow_Sum <= 1.27056e+07 )
									ret := -0.029812
								if( Positive_Money_Flow_Sum > 1.27056e+07 )
									ret := 0.176309
							if( Money_Flow_Ratio > 2.81148 )
								if( d_k <= 6.97141 )
									ret := 0.612500
								if( d_k > 6.97141 )
									ret := 0.040816
					if( smoothK_k > 73.6933 )
						if( smoothD_d <= 87.6162 )
							if( Raw_Money_Flow <= 709368 )
								if( MFI_High <= -35.6102 )
									ret := 0.168675
								if( MFI_High > -35.6102 )
									ret := -0.056485
							if( Raw_Money_Flow > 709368 )
								if( Negative_Money_Flow_Sum <= 1.33064e+07 )
									ret := 0.288462
								if( Negative_Money_Flow_Sum > 1.33064e+07 )
									ret := 0.617647
						if( smoothD_d > 87.6162 )
							if( smoothD_d <= 87.8288 )
								ret := -0.750000 // sell
							if( smoothD_d > 87.8288 )
								if( Raw_Money_Flow <= 2.56785e+06 )
									ret := -0.089810
								if( Raw_Money_Flow > 2.56785e+06 )
									ret := 0.750000 // buy
		if( rsi1 > 51.3736 )
			if( Positive_Money_Flow <= 173506 )
				if( Negative_Money_Flow <= 897.622 )
					if( Positive_Money_Flow <= 35678.5 )
						if( Raw_Money_Flow <= 67925.9 )
							if( Money_Flow_Ratio <= 0.575299 )
								if( d_k <= 6.43345 )
									ret := -0.467972
								if( d_k > 6.43345 )
									ret := -0.139344
							if( Money_Flow_Ratio > 0.575299 )
								if( d <= 74.4783 )
									ret := -0.292672
								if( d > 74.4783 )
									ret := -0.125216
						if( Raw_Money_Flow > 67925.9 )
							if( d <= 97.762 )
								if( k <= 92.5015 )
									ret := 0.146552
								if( k > 92.5015 )
									ret := 0.533333
							if( d > 97.762 )
								ret := -0.266667
					if( Positive_Money_Flow > 35678.5 )
						if( k <= 61.4977 )
							if( MFI_Low <= 60.3877 )
								if( rsi1 <= 67.5022 )
									ret := -0.009115
								if( rsi1 > 67.5022 )
									ret := 0.472081
							if( MFI_Low > 60.3877 )
								if( smoothK_k <= 35.6749 )
									ret := 0.079365
								if( smoothK_k > 35.6749 )
									ret := -0.563830
						if( k > 61.4977 )
							if( MFI_Low <= 68.8646 )
								if( smoothD_d <= 89.2246 )
									ret := -0.216025
								if( smoothD_d > 89.2246 )
									ret := -0.058309
							if( MFI_Low > 68.8646 )
								if( Positive_Money_Flow_Sum <= 773350 )
									ret := -0.450000
								if( Positive_Money_Flow_Sum > 773350 )
									ret := 0.296610
				if( Negative_Money_Flow > 897.622 )
					if( d_k <= 4.20663 )
						if( rsi1 <= 59.6453 )
							if( MFI_Low <= 60.133 )
								if( Positive_Money_Flow_Sum <= 99935.1 )
									ret := 0.370370
								if( Positive_Money_Flow_Sum > 99935.1 )
									ret := -0.054319
							if( MFI_Low > 60.133 )
								if( d_k <= -14.3718 )
									ret := -0.473684
								if( d_k > -14.3718 )
									ret := 0.318408
						if( rsi1 > 59.6453 )
							if( d <= 79.6751 )
								if( MFI_High <= -3.05521 )
									ret := -0.086870
								if( MFI_High > -3.05521 )
									ret := 0.190709
							if( d > 79.6751 )
								if( Negative_Money_Flow_Sum <= 3.13636e+06 )
									ret := -0.124884
								if( Negative_Money_Flow_Sum > 3.13636e+06 )
									ret := -0.292350
					if( d_k > 4.20663 )
						if( Money_Flow_Ratio <= 0.990734 )
							if( Typical_Price <= 24.728 )
								if( Typical_Price <= 23.7672 )
									ret := -0.900000 // sell
								if( Typical_Price > 23.7672 )
									ret := -0.272727
							if( Typical_Price > 24.728 )
								if( rsi1 <= 73.0509 )
									ret := 0.266454
								if( rsi1 > 73.0509 )
									ret := -0.800000 // sell
						if( Money_Flow_Ratio > 0.990734 )
							if( Negative_Money_Flow <= 7.01259e+06 )
								if( d_k <= 14.4051 )
									ret := 0.049166
								if( d_k > 14.4051 )
									ret := -0.142146
							if( Negative_Money_Flow > 7.01259e+06 )
								if( Negative_Money_Flow_Sum <= 2.47276e+07 )
									ret := -0.941176 // sell
								if( Negative_Money_Flow_Sum > 2.47276e+07 )
									ret := -0.714286 // sell
			if( Positive_Money_Flow > 173506 )
				if( smoothD_d <= 94.8982 )
					if( Positive_Money_Flow_Sum <= 1.06868e+06 )
						if( MFI <= 84.9209 )
							if( Raw_Money_Flow <= 362918 )
								if( Positive_Money_Flow_Sum <= 644036 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 644036 )
									ret := 0.106599
							if( Raw_Money_Flow > 362918 )
								if( smoothD_d <= 46.5248 )
									ret := -0.980000 // sell
								if( smoothD_d > 46.5248 )
									ret := 0.043478
						if( MFI > 84.9209 )
							if( Negative_Money_Flow_Sum <= 75026 )
								ret := -0.636364
							if( Negative_Money_Flow_Sum > 75026 )
								if( d_k <= -13.2476 )
									ret := -0.846154 // sell
								if( d_k > -13.2476 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.06868e+06 )
						if( Raw_Money_Flow <= 2.72617e+06 )
							if( Raw_Money_Flow <= 1.9309e+06 )
								if( d_k <= -6.04047 )
									ret := -0.064409
								if( d_k > -6.04047 )
									ret := 0.045334
							if( Raw_Money_Flow > 1.9309e+06 )
								if( MFI <= 81.5896 )
									ret := 0.356143
								if( MFI > 81.5896 )
									ret := -0.097674
						if( Raw_Money_Flow > 2.72617e+06 )
							if( k <= 38.4302 )
								if( Positive_Money_Flow_Sum <= 1.64616e+07 )
									ret := -0.081081
								if( Positive_Money_Flow_Sum > 1.64616e+07 )
									ret := -0.547059
							if( k > 38.4302 )
								if( d <= 35.2199 )
									ret := 0.687500
								if( d > 35.2199 )
									ret := -0.091922
				if( smoothD_d > 94.8982 )
					if( Positive_Money_Flow_Sum <= 2.7165e+07 )
						if( Negative_Money_Flow_Sum <= 9.38756e+06 )
							if( Raw_Money_Flow <= 1.35794e+06 )
								if( MFI <= 98.1094 )
									ret := -0.102757
								if( MFI > 98.1094 )
									ret := 0.705882 // buy
							if( Raw_Money_Flow > 1.35794e+06 )
								if( MFI_Low <= 67.3125 )
									ret := -0.264000
								if( MFI_Low > 67.3125 )
									ret := -0.678571
						if( Negative_Money_Flow_Sum > 9.38756e+06 )
							ret := 0.777778 // buy
					if( Positive_Money_Flow_Sum > 2.7165e+07 )
						if( rsi1 <= 82.4424 )
							if( Typical_Price <= 41.6225 )
								if( Money_Flow_Ratio <= 3.4007 )
									ret := -0.769231 // sell
								if( Money_Flow_Ratio > 3.4007 )
									ret := -0.909091 // sell
							if( Typical_Price > 41.6225 )
								ret := -1.000000 // sell
						if( rsi1 > 82.4424 )
							ret := -0.187500
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_AFRM_1Min_a03b02f5(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


