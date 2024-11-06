//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: TSLA_30Min_2MT0_656805f7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_2MT0_656805f7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_656805f7(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Money_Flow_Ratio <= 0.817369 )
		if( Raw_Money_Flow <= 8.20889e+08 )
			if( tema <= 475.021 )
				if( ema12 <= -6.92733 )
					if( MFI <= 40.6281 )
						if( Typical_Price <= 289.302 )
							if( Typical_Price <= 266.46 )
								ret := 0.500000
							if( Typical_Price > 266.46 )
								ret := -0.466667
						if( Typical_Price > 289.302 )
							if( Negative_Money_Flow_Sum <= 1.62099e+10 )
								if( Raw_Money_Flow <= 9.12007e+07 )
									ret := 0.655172
								if( Raw_Money_Flow > 9.12007e+07 )
									ret := 0.941748 // buy
							if( Negative_Money_Flow_Sum > 1.62099e+10 )
								ret := -0.200000
					if( MFI > 40.6281 )
						if( Typical_Price <= 373.418 )
							ret := 0.266667
						if( Typical_Price > 373.418 )
							ret := -0.545455
				if( ema12 > -6.92733 )
					if( Positive_Money_Flow <= 5.60814e+07 )
						if( Negative_Money_Flow <= 628868 )
							if( ema12 <= -4.39239 )
								if( MFI_High <= -61.1088 )
									ret := -0.454545
								if( MFI_High > -61.1088 )
									ret := -0.939394 // sell
							if( ema12 > -4.39239 )
								if( Positive_Money_Flow_Sum <= 4.69211e+09 )
									ret := 0.022535
								if( Positive_Money_Flow_Sum > 4.69211e+09 )
									ret := 0.297297
						if( Negative_Money_Flow > 628868 )
							if( Negative_Money_Flow_Sum <= 1.04583e+10 )
								if( Negative_Money_Flow_Sum <= 1.18373e+08 )
									ret := 0.051613
								if( Negative_Money_Flow_Sum > 1.18373e+08 )
									ret := -0.070613
							if( Negative_Money_Flow_Sum > 1.04583e+10 )
								if( MFI <= 1.09581 )
									ret := 1.000000 // buy
								if( MFI > 1.09581 )
									ret := 0.141962
					if( Positive_Money_Flow > 5.60814e+07 )
						if( ema13 <= -0.617734 )
							if( Negative_Money_Flow_Sum <= 1.75206e+10 )
								if( Negative_Money_Flow_Sum <= 1.55224e+10 )
									ret := -0.197074
								if( Negative_Money_Flow_Sum > 1.55224e+10 )
									ret := 0.657895
							if( Negative_Money_Flow_Sum > 1.75206e+10 )
								if( tema <= 257.347 )
									ret := -0.285714
								if( tema > 257.347 )
									ret := -0.947368 // sell
						if( ema13 > -0.617734 )
							if( MFI_High <= -49.0088 )
								if( Money_Flow_Ratio <= 0.32569 )
									ret := -0.063158
								if( Money_Flow_Ratio > 0.32569 )
									ret := 0.512346
							if( MFI_High > -49.0088 )
								if( Positive_Money_Flow_Sum <= 2.59888e+08 )
									ret := -0.373684
								if( Positive_Money_Flow_Sum > 2.59888e+08 )
									ret := 0.111111
			if( tema > 475.021 )
				if( MFI_Low <= 19.5646 )
					if( MFI_High <= -79.6198 )
						ret := 0.842105 // buy
					if( MFI_High > -79.6198 )
						if( Negative_Money_Flow <= 1.23251e+08 )
							if( ema12 <= -1.04924 )
								if( Negative_Money_Flow_Sum <= 9.80726e+09 )
									ret := 0.142631
								if( Negative_Money_Flow_Sum > 9.80726e+09 )
									ret := -0.070461
							if( ema12 > -1.04924 )
								if( Negative_Money_Flow <= 8.02738e+07 )
									ret := 0.007191
								if( Negative_Money_Flow > 8.02738e+07 )
									ret := -0.430233
						if( Negative_Money_Flow > 1.23251e+08 )
							if( ema3 <= 1503.63 )
								if( Positive_Money_Flow_Sum <= 1.43351e+08 )
									ret := 0.622378
								if( Positive_Money_Flow_Sum > 1.43351e+08 )
									ret := 0.135992
							if( ema3 > 1503.63 )
								if( ema12 <= -3.3694 )
									ret := 0.862069 // buy
								if( ema12 > -3.3694 )
									ret := 0.470588
				if( MFI_Low > 19.5646 )
					if( tema <= 1140.34 )
						if( ema13 <= 3.54682 )
							if( Negative_Money_Flow <= 7.33225e+07 )
								if( Positive_Money_Flow <= 3.38993e+07 )
									ret := -0.186782
								if( Positive_Money_Flow > 3.38993e+07 )
									ret := 0.043796
							if( Negative_Money_Flow > 7.33225e+07 )
								if( tema <= 498.019 )
									ret := -0.818182 // sell
								if( tema > 498.019 )
									ret := 0.197425
						if( ema13 > 3.54682 )
							if( ema13 <= 4.74791 )
								if( Negative_Money_Flow_Sum <= 9.02806e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 9.02806e+08 )
									ret := -0.482143
							if( ema13 > 4.74791 )
								if( Raw_Money_Flow <= 6.36088e+06 )
									ret := 0.923077 // buy
								if( Raw_Money_Flow > 6.36088e+06 )
									ret := -0.216783
					if( tema > 1140.34 )
						if( MFI_High <= -35.8003 )
							if( ema12 <= -6.90359 )
								ret := -0.538462
							if( ema12 > -6.90359 )
								if( ema12 <= 1.03753 )
									ret := 0.425926
								if( ema12 > 1.03753 )
									ret := -0.227273
						if( MFI_High > -35.8003 )
							if( MFI <= 44.4896 )
								ret := 0.937500 // buy
							if( MFI > 44.4896 )
								ret := 0.900000 // buy
		if( Raw_Money_Flow > 8.20889e+08 )
			if( ema3 <= 202.475 )
				if( MFI_High <= -78.1246 )
					if( MFI_High <= -78.5094 )
						if( Negative_Money_Flow <= 1.63096e+09 )
							if( tema <= 167.207 )
								ret := 1.000000 // buy
							if( tema > 167.207 )
								ret := 0.411765
						if( Negative_Money_Flow > 1.63096e+09 )
							ret := 0.000000
					if( MFI_High > -78.5094 )
						if( tema <= 173.492 )
							ret := 1.000000 // buy
						if( tema > 173.492 )
							ret := 0.642857
				if( MFI_High > -78.1246 )
					if( MFI_High <= -37.3249 )
						if( Negative_Money_Flow <= 2.26405e+09 )
							if( ema3 <= 191.982 )
								if( Money_Flow_Ratio <= 0.33586 )
									ret := 0.226115
								if( Money_Flow_Ratio > 0.33586 )
									ret := 0.008174
							if( ema3 > 191.982 )
								if( ema12 <= -2.54943 )
									ret := -0.368421
								if( ema12 > -2.54943 )
									ret := 0.399225
						if( Negative_Money_Flow > 2.26405e+09 )
							if( Negative_Money_Flow <= 3.01789e+09 )
								if( MFI_Low <= -16.0226 )
									ret := -0.756098 // sell
								if( MFI_Low > -16.0226 )
									ret := -0.425287
							if( Negative_Money_Flow > 3.01789e+09 )
								if( MFI_High <= -65.8338 )
									ret := 0.032967
								if( MFI_High > -65.8338 )
									ret := 0.800000 // buy
					if( MFI_High > -37.3249 )
						if( Typical_Price <= 191.6 )
							if( ema1 <= 186.291 )
								if( Raw_Money_Flow <= 9.85177e+08 )
									ret := -0.857143 // sell
								if( Raw_Money_Flow > 9.85177e+08 )
									ret := 0.033333
							if( ema1 > 186.291 )
								ret := 0.363636
						if( Typical_Price > 191.6 )
							ret := -0.772727 // sell
			if( ema3 > 202.475 )
				if( MFI_High <= -70.4395 )
					if( tema <= 296.744 )
						if( ema2 <= 215.652 )
							if( ema2 <= 213.37 )
								if( MFI <= 6.10144 )
									ret := -0.211268
								if( MFI > 6.10144 )
									ret := 0.666667
							if( ema2 > 213.37 )
								ret := 0.937500 // buy
						if( ema2 > 215.652 )
							if( MFI <= 2.25659 )
								if( ema13 <= -0.326442 )
									ret := 0.227941
								if( ema13 > -0.326442 )
									ret := -0.909091 // sell
							if( MFI > 2.25659 )
								if( Negative_Money_Flow_Sum <= 1.25406e+09 )
									ret := 0.600000
								if( Negative_Money_Flow_Sum > 1.25406e+09 )
									ret := -0.408989
					if( tema > 296.744 )
						if( Positive_Money_Flow_Sum <= 1.15554e+09 )
							if( ema12 <= -21.6319 )
								if( ema1 <= 938.378 )
									ret := -1.000000 // sell
								if( ema1 > 938.378 )
									ret := -0.666667
							if( ema12 > -21.6319 )
								if( Raw_Money_Flow <= 1.2401e+09 )
									ret := 0.463054
								if( Raw_Money_Flow > 1.2401e+09 )
									ret := -0.018642
						if( Positive_Money_Flow_Sum > 1.15554e+09 )
							if( MFI_High <= -71.0731 )
								if( tema <= 686.666 )
									ret := 1.000000 // buy
								if( tema > 686.666 )
									ret := 0.678571
							if( MFI_High > -71.0731 )
								if( ema2 <= 793.036 )
									ret := 0.000000
								if( ema2 > 793.036 )
									ret := 0.444444
				if( MFI_High > -70.4395 )
					if( Negative_Money_Flow_Sum <= 1.21481e+10 )
						if( Raw_Money_Flow <= 1.17331e+09 )
							if( ema12 <= 1.80353 )
								if( MFI <= 25.1413 )
									ret := -0.396825
								if( MFI > 25.1413 )
									ret := -0.163057
							if( ema12 > 1.80353 )
								if( Positive_Money_Flow_Sum <= 2.7133e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.7133e+09 )
									ret := 0.571429
						if( Raw_Money_Flow > 1.17331e+09 )
							if( Negative_Money_Flow <= 8.02734e+09 )
								if( MFI_Low <= -7.15189 )
									ret := -0.405556
								if( MFI_Low > -7.15189 )
									ret := 0.011912
							if( Negative_Money_Flow > 8.02734e+09 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.21481e+10 )
						if( Positive_Money_Flow <= 2.80203e+09 )
							if( ema13 <= -5.02839 )
								if( MFI_Low <= -9.53432 )
									ret := 0.138889
								if( MFI_Low > -9.53432 )
									ret := -0.446142
							if( ema13 > -5.02839 )
								if( ema3 <= 875.333 )
									ret := -0.130584
								if( ema3 > 875.333 )
									ret := -0.581395
						if( Positive_Money_Flow > 2.80203e+09 )
							if( ema1 <= 994.4 )
								if( Positive_Money_Flow_Sum <= 9.71288e+09 )
									ret := 0.702128 // buy
								if( Positive_Money_Flow_Sum > 9.71288e+09 )
									ret := -0.142857
							if( ema1 > 994.4 )
								if( MFI <= 27.3337 )
									ret := -0.545455
								if( MFI > 27.3337 )
									ret := 0.300000
	if( Money_Flow_Ratio > 0.817369 )
		if( tema <= 1266.7 )
			if( MFI <= 97.8997 )
				if( ema12 <= 7.1606 )
					if( tema <= 113.848 )
						if( Raw_Money_Flow <= 2.15495e+08 )
							if( MFI_High <= -23.7927 )
								ret := 0.000000
							if( MFI_High > -23.7927 )
								ret := 0.600000
						if( Raw_Money_Flow > 2.15495e+08 )
							if( ema13 <= 1.02306 )
								ret := 1.000000 // buy
							if( ema13 > 1.02306 )
								ret := 0.500000
					if( tema > 113.848 )
						if( ema13 <= 4.45174 )
							if( Money_Flow_Ratio <= 3.46832 )
								if( Negative_Money_Flow_Sum <= 2.43497e+09 )
									ret := -0.016483
								if( Negative_Money_Flow_Sum > 2.43497e+09 )
									ret := 0.072499
							if( Money_Flow_Ratio > 3.46832 )
								if( ema13 <= -39.3876 )
									ret := 0.966102 // buy
								if( ema13 > -39.3876 )
									ret := -0.038922
						if( ema13 > 4.45174 )
							if( Negative_Money_Flow_Sum <= 4.19027e+08 )
								if( Typical_Price <= 822.665 )
									ret := -0.023824
								if( Typical_Price > 822.665 )
									ret := -0.305907
							if( Negative_Money_Flow_Sum > 4.19027e+08 )
								if( Raw_Money_Flow <= 1.96015e+07 )
									ret := 0.271335
								if( Raw_Money_Flow > 1.96015e+07 )
									ret := 0.084444
				if( ema12 > 7.1606 )
					if( MFI_Low <= 73.6011 )
						if( tema <= 1203.91 )
							if( Money_Flow_Ratio <= 8.78384 )
								if( Negative_Money_Flow <= 1.67639e+09 )
									ret := 0.207251
								if( Negative_Money_Flow > 1.67639e+09 )
									ret := -0.185185
							if( Money_Flow_Ratio > 8.78384 )
								if( Typical_Price <= 1081.29 )
									ret := 0.428571
								if( Typical_Price > 1081.29 )
									ret := 1.000000 // buy
						if( tema > 1203.91 )
							if( Negative_Money_Flow_Sum <= 6.11398e+09 )
								if( MFI_High <= -15.6078 )
									ret := -0.750000 // sell
								if( MFI_High > -15.6078 )
									ret := 0.562500
							if( Negative_Money_Flow_Sum > 6.11398e+09 )
								if( Typical_Price <= 1212.61 )
									ret := -0.727273 // sell
								if( Typical_Price > 1212.61 )
									ret := -1.000000 // sell
					if( MFI_Low > 73.6011 )
						if( Negative_Money_Flow_Sum <= 6.25824e+08 )
							if( Raw_Money_Flow <= 1.70844e+08 )
								if( Positive_Money_Flow_Sum <= 3.33743e+09 )
									ret := -0.766667 // sell
								if( Positive_Money_Flow_Sum > 3.33743e+09 )
									ret := 0.000000
							if( Raw_Money_Flow > 1.70844e+08 )
								if( Positive_Money_Flow_Sum <= 8.51083e+09 )
									ret := 0.523256
								if( Positive_Money_Flow_Sum > 8.51083e+09 )
									ret := -0.159420
						if( Negative_Money_Flow_Sum > 6.25824e+08 )
							if( tema <= 1145.02 )
								if( ema1 <= 587.469 )
									ret := 0.000000
								if( ema1 > 587.469 )
									ret := -0.909091 // sell
							if( tema > 1145.02 )
								ret := 0.533333
			if( MFI > 97.8997 )
				if( Negative_Money_Flow <= 4097.45 )
					if( tema <= 1007.43 )
						if( ema12 <= -0.355465 )
							if( ema13 <= -2.52543 )
								ret := -1.000000 // sell
							if( ema13 > -2.52543 )
								ret := -0.333333
						if( ema12 > -0.355465 )
							if( MFI_High <= 17.9118 )
								ret := 0.944444 // buy
							if( MFI_High > 17.9118 )
								if( Positive_Money_Flow <= 1.72671e+08 )
									ret := 0.098474
								if( Positive_Money_Flow > 1.72671e+08 )
									ret := 0.217504
					if( tema > 1007.43 )
						if( Money_Flow_Ratio <= 93.2217 )
							if( Positive_Money_Flow <= 2.03983e+09 )
								ret := 0.300000
							if( Positive_Money_Flow > 2.03983e+09 )
								ret := -0.700000 // sell
						if( Money_Flow_Ratio > 93.2217 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow > 4097.45 )
					if( ema12 <= 1.13918 )
						if( ema13 <= -0.072207 )
							if( Positive_Money_Flow <= 68719.2 )
								if( ema12 <= -0.225068 )
									ret := 0.156250
								if( ema12 > -0.225068 )
									ret := -0.692308
							if( Positive_Money_Flow > 68719.2 )
								if( Positive_Money_Flow <= 291335 )
									ret := -0.600000
								if( Positive_Money_Flow > 291335 )
									ret := -1.000000 // sell
						if( ema13 > -0.072207 )
							if( ema12 <= 0.284829 )
								if( Positive_Money_Flow_Sum <= 2.27989e+08 )
									ret := 0.791667 // buy
								if( Positive_Money_Flow_Sum > 2.27989e+08 )
									ret := 0.247059
							if( ema12 > 0.284829 )
								if( ema13 <= 2.10984 )
									ret := -0.166667
								if( ema13 > 2.10984 )
									ret := 0.436364
					if( ema12 > 1.13918 )
						if( MFI_High <= 18.9229 )
							if( Positive_Money_Flow_Sum <= 6.54098e+09 )
								if( Negative_Money_Flow_Sum <= 9.41653e+07 )
									ret := 0.020408
								if( Negative_Money_Flow_Sum > 9.41653e+07 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 6.54098e+09 )
								if( Negative_Money_Flow <= 9.49688e+06 )
									ret := 0.071429
								if( Negative_Money_Flow > 9.49688e+06 )
									ret := 0.818182 // buy
						if( MFI_High > 18.9229 )
							if( ema3 <= 315.876 )
								if( ema3 <= 209.562 )
									ret := -0.333333
								if( ema3 > 209.562 )
									ret := -0.800000 // sell
							if( ema3 > 315.876 )
								if( MFI_Low <= 79.274 )
									ret := -0.444444
								if( MFI_Low > 79.274 )
									ret := 0.375000
		if( tema > 1266.7 )
			if( ema12 <= -5.66043 )
				if( Positive_Money_Flow_Sum <= 6.16759e+09 )
					if( ema12 <= -12.2208 )
						ret := 0.846154 // buy
					if( ema12 > -12.2208 )
						ret := 0.066667
				if( Positive_Money_Flow_Sum > 6.16759e+09 )
					if( Negative_Money_Flow_Sum <= 7.65701e+09 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 7.65701e+09 )
						if( Positive_Money_Flow <= 1.43572e+07 )
							ret := -0.157895
						if( Positive_Money_Flow > 1.43572e+07 )
							ret := -0.916667 // sell
			if( ema12 > -5.66043 )
				if( ema1 <= 1336.24 )
					if( MFI_Low <= 43.3713 )
						if( Money_Flow_Ratio <= 1.13658 )
							ret := 0.846154 // buy
						if( Money_Flow_Ratio > 1.13658 )
							if( Negative_Money_Flow_Sum <= 4.12895e+09 )
								ret := -0.636364
							if( Negative_Money_Flow_Sum > 4.12895e+09 )
								ret := 0.384615
					if( MFI_Low > 43.3713 )
						if( Positive_Money_Flow_Sum <= 4.31645e+09 )
							ret := 0.300000
						if( Positive_Money_Flow_Sum > 4.31645e+09 )
							if( Negative_Money_Flow_Sum <= 2.43373e+09 )
								ret := 0.764706 // buy
							if( Negative_Money_Flow_Sum > 2.43373e+09 )
								ret := 1.000000 // buy
				if( ema1 > 1336.24 )
					if( Negative_Money_Flow <= 5.78855e+08 )
						if( Negative_Money_Flow_Sum <= 4.32789e+08 )
							if( MFI_Low <= 36.1697 )
								ret := 0.833333 // buy
							if( MFI_Low > 36.1697 )
								if( MFI_Low <= 75.3475 )
									ret := -0.500000
								if( MFI_Low > 75.3475 )
									ret := 0.139241
						if( Negative_Money_Flow_Sum > 4.32789e+08 )
							if( Money_Flow_Ratio <= 3.5474 )
								if( Raw_Money_Flow <= 2.0922e+09 )
									ret := 0.261538
								if( Raw_Money_Flow > 2.0922e+09 )
									ret := 0.842105 // buy
							if( Money_Flow_Ratio > 3.5474 )
								if( Typical_Price <= 1998.54 )
									ret := 0.734694 // buy
								if( Typical_Price > 1998.54 )
									ret := 0.333333
					if( Negative_Money_Flow > 5.78855e+08 )
						if( ema3 <= 1517.17 )
							if( tema <= 1505.98 )
								if( ema1 <= 1437.37 )
									ret := -0.500000
								if( ema1 > 1437.37 )
									ret := 0.105263
							if( tema > 1505.98 )
								ret := -0.700000 // sell
						if( ema3 > 1517.17 )
							if( Typical_Price <= 1635.37 )
								ret := 0.538462
							if( Typical_Price > 1635.37 )
								if( Typical_Price <= 1747.6 )
									ret := -0.818182 // sell
								if( Typical_Price > 1747.6 )
									ret := 0.260870
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_TSLA_30Min_656805f7(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


