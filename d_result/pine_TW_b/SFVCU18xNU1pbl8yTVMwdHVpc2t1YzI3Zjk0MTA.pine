//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: HUBS_15Min_2MS0_c27f9410 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2MS0_c27f9410", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_c27f9410(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 49.5337 )
		if( Positive_Money_Flow_Sum <= 1.40059e+08 )
			if( Raw_Money_Flow <= 96431.8 )
				if( Negative_Money_Flow_Sum <= 1.11597e+08 )
					if( d_k <= -9.69149 )
						if( Money_Flow_Ratio <= 0.458001 )
							if( smoothK_k <= 74.6313 )
								if( MFI_High <= -73.3347 )
									ret := 1.000000 // buy
								if( MFI_High > -73.3347 )
									ret := -0.741573 // sell
							if( smoothK_k > 74.6313 )
								ret := 0.450000
						if( Money_Flow_Ratio > 0.458001 )
							if( Typical_Price <= 248.219 )
								if( Positive_Money_Flow_Sum <= 2.13297e+07 )
									ret := 0.478261
								if( Positive_Money_Flow_Sum > 2.13297e+07 )
									ret := -0.888889 // sell
							if( Typical_Price > 248.219 )
								ret := 0.818182 // buy
					if( d_k > -9.69149 )
						if( k <= 72.9874 )
							if( Negative_Money_Flow_Sum <= 6.00174e+07 )
								if( smoothK_k <= 28.4759 )
									ret := 0.277580
								if( smoothK_k > 28.4759 )
									ret := 0.631868
							if( Negative_Money_Flow_Sum > 6.00174e+07 )
								if( d <= 8.02594 )
									ret := 0.529412
								if( d > 8.02594 )
									ret := -0.253623
						if( k > 72.9874 )
							if( Positive_Money_Flow_Sum <= 1.91204e+07 )
								if( MFI_Low <= -10.5759 )
									ret := -1.000000 // sell
								if( MFI_Low > -10.5759 )
									ret := -0.384615
							if( Positive_Money_Flow_Sum > 1.91204e+07 )
								if( Negative_Money_Flow_Sum <= 7.63814e+07 )
									ret := 0.694444
								if( Negative_Money_Flow_Sum > 7.63814e+07 )
									ret := -0.571429
				if( Negative_Money_Flow_Sum > 1.11597e+08 )
					if( k <= 84.8556 )
						if( k <= 5.4168 )
							if( d <= 5.31676 )
								ret := 0.533333
							if( d > 5.31676 )
								ret := -0.400000
						if( k > 5.4168 )
							if( Money_Flow_Ratio <= 0.466048 )
								if( MFI_High <= -52.9701 )
									ret := 0.714286 // buy
								if( MFI_High > -52.9701 )
									ret := -0.066667
							if( Money_Flow_Ratio > 0.466048 )
								if( Raw_Money_Flow <= 55799.2 )
									ret := 0.785714 // buy
								if( Raw_Money_Flow > 55799.2 )
									ret := 0.980000 // buy
					if( k > 84.8556 )
						ret := -0.500000
			if( Raw_Money_Flow > 96431.8 )
				if( Negative_Money_Flow_Sum <= 5.90245e+08 )
					if( MFI <= 5.98319 )
						if( MFI_High <= -77.727 )
							if( Raw_Money_Flow <= 1.635e+07 )
								if( Negative_Money_Flow_Sum <= 1.05195e+08 )
									ret := 0.700000 // buy
								if( Negative_Money_Flow_Sum > 1.05195e+08 )
									ret := -0.461538
							if( Raw_Money_Flow > 1.635e+07 )
								ret := 0.440000
						if( MFI_High > -77.727 )
							if( smoothK_k <= 7.94362 )
								if( rsi1 <= 17.4173 )
									ret := -0.645349
								if( rsi1 > 17.4173 )
									ret := -0.017857
							if( smoothK_k > 7.94362 )
								if( Typical_Price <= 177.456 )
									ret := -0.711111 // sell
								if( Typical_Price > 177.456 )
									ret := 0.103448
					if( MFI > 5.98319 )
						if( Negative_Money_Flow <= 4.2363e+06 )
							if( Negative_Money_Flow <= 3.23474e+06 )
								if( Positive_Money_Flow <= 1.40252e+07 )
									ret := 0.010341
								if( Positive_Money_Flow > 1.40252e+07 )
									ret := 0.131305
							if( Negative_Money_Flow > 3.23474e+06 )
								if( smoothD_d <= -0.981204 )
									ret := 0.340659
								if( smoothD_d > -0.981204 )
									ret := -0.146061
						if( Negative_Money_Flow > 4.2363e+06 )
							if( Money_Flow_Ratio <= 0.110067 )
								if( d_k <= 0.354404 )
									ret := 0.098160
								if( d_k > 0.354404 )
									ret := 0.488889
							if( Money_Flow_Ratio > 0.110067 )
								if( Positive_Money_Flow_Sum <= 1.0611e+07 )
									ret := 0.320321
								if( Positive_Money_Flow_Sum > 1.0611e+07 )
									ret := 0.045873
				if( Negative_Money_Flow_Sum > 5.90245e+08 )
					if( smoothD_d <= 39.4202 )
						if( rsi1 <= 23.1502 )
							ret := 0.818182 // buy
						if( rsi1 > 23.1502 )
							ret := 1.000000 // buy
					if( smoothD_d > 39.4202 )
						ret := 0.300000
		if( Positive_Money_Flow_Sum > 1.40059e+08 )
			if( k <= 3.26664 )
				if( d_k <= 1.38112 )
					ret := 0.666667
				if( d_k > 1.38112 )
					ret := 0.090909
			if( k > 3.26664 )
				if( Raw_Money_Flow <= 6.14468e+06 )
					if( smoothK_k <= 55.3294 )
						if( smoothK_k <= 19.533 )
							ret := 0.062500
						if( smoothK_k > 19.533 )
							ret := 1.000000 // buy
					if( smoothK_k > 55.3294 )
						ret := -0.307692
				if( Raw_Money_Flow > 6.14468e+06 )
					if( Negative_Money_Flow_Sum <= 2.15775e+08 )
						if( Typical_Price <= 605.103 )
							if( Negative_Money_Flow <= 6.43267e+06 )
								if( k <= 37.3677 )
									ret := 0.214286
								if( k > 37.3677 )
									ret := -0.780000 // sell
							if( Negative_Money_Flow > 6.43267e+06 )
								if( MFI <= 47.3101 )
									ret := 0.437500
								if( MFI > 47.3101 )
									ret := -0.370370
						if( Typical_Price > 605.103 )
							if( Raw_Money_Flow <= 1.5975e+07 )
								if( Negative_Money_Flow_Sum <= 1.73395e+08 )
									ret := -0.769231 // sell
								if( Negative_Money_Flow_Sum > 1.73395e+08 )
									ret := 0.545455
							if( Raw_Money_Flow > 1.5975e+07 )
								if( Positive_Money_Flow_Sum <= 1.55865e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.55865e+08 )
									ret := 0.538462
					if( Negative_Money_Flow_Sum > 2.15775e+08 )
						if( k <= 65.3448 )
							if( rsi1 <= 33.0911 )
								if( Positive_Money_Flow_Sum <= 1.67184e+08 )
									ret := -0.178571
								if( Positive_Money_Flow_Sum > 1.67184e+08 )
									ret := 0.578947
							if( rsi1 > 33.0911 )
								if( rsi1 <= 47.3284 )
									ret := -0.835616 // sell
								if( rsi1 > 47.3284 )
									ret := -0.965517 // sell
						if( k > 65.3448 )
							if( rsi1 <= 53.2258 )
								if( Money_Flow_Ratio <= 0.708241 )
									ret := 0.300000
								if( Money_Flow_Ratio > 0.708241 )
									ret := 0.777778 // buy
							if( rsi1 > 53.2258 )
								if( Negative_Money_Flow <= 1.78887e+07 )
									ret := -0.176471
								if( Negative_Money_Flow > 1.78887e+07 )
									ret := -0.923077 // sell
	if( MFI > 49.5337 )
		if( Negative_Money_Flow_Sum <= 1.31977e+07 )
			if( Positive_Money_Flow <= 1.68034e+06 )
				if( MFI_High <= 17.4997 )
					if( Raw_Money_Flow <= 68136.1 )
						if( Positive_Money_Flow_Sum <= 2.11115e+07 )
							if( Positive_Money_Flow_Sum <= 1.88955e+07 )
								if( smoothD_d <= 50.8213 )
									ret := -0.176471
								if( smoothD_d > 50.8213 )
									ret := 0.333333
							if( Positive_Money_Flow_Sum > 1.88955e+07 )
								if( k <= 68.8502 )
									ret := -0.545455
								if( k > 68.8502 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.11115e+07 )
							if( smoothK_k <= 94.0378 )
								if( Negative_Money_Flow_Sum <= 4.98677e+06 )
									ret := 0.847826 // buy
								if( Negative_Money_Flow_Sum > 4.98677e+06 )
									ret := 0.602740
							if( smoothK_k > 94.0378 )
								if( d_k <= -0.225039 )
									ret := 0.476190
								if( d_k > -0.225039 )
									ret := -0.846154 // sell
					if( Raw_Money_Flow > 68136.1 )
						if( Positive_Money_Flow_Sum <= 7.1467e+06 )
							if( k <= 44.4622 )
								if( d_k <= -2.83045 )
									ret := 0.046243
								if( d_k > -2.83045 )
									ret := -0.223183
							if( k > 44.4622 )
								if( Typical_Price <= 208.28 )
									ret := 0.015849
								if( Typical_Price > 208.28 )
									ret := 0.636364
						if( Positive_Money_Flow_Sum > 7.1467e+06 )
							if( k <= 66.9057 )
								if( Typical_Price <= 138.913 )
									ret := 0.204108
								if( Typical_Price > 138.913 )
									ret := 0.004143
							if( k > 66.9057 )
								if( Positive_Money_Flow_Sum <= 1.91829e+07 )
									ret := 0.067215
								if( Positive_Money_Flow_Sum > 1.91829e+07 )
									ret := -0.049498
				if( MFI_High > 17.4997 )
					if( Money_Flow_Ratio <= 82.7496 )
						ret := 0.416667
					if( Money_Flow_Ratio > 82.7496 )
						ret := 1.000000 // buy
			if( Positive_Money_Flow > 1.68034e+06 )
				if( smoothD_d <= 3.91731 )
					if( MFI_Low <= 50.8094 )
						if( smoothD_d <= 2.21442 )
							if( Negative_Money_Flow_Sum <= 1.14199e+07 )
								if( MFI_High <= -19.7455 )
									ret := 0.363636
								if( MFI_High > -19.7455 )
									ret := -0.100000
							if( Negative_Money_Flow_Sum > 1.14199e+07 )
								ret := 0.750000 // buy
						if( smoothD_d > 2.21442 )
							if( Typical_Price <= 153.275 )
								ret := 0.100000
							if( Typical_Price > 153.275 )
								ret := -0.444444
					if( MFI_Low > 50.8094 )
						if( MFI <= 74.7119 )
							if( smoothK_k <= 1.44156 )
								ret := 0.727273 // buy
							if( smoothK_k > 1.44156 )
								ret := 1.000000 // buy
						if( MFI > 74.7119 )
							if( smoothK_k <= 0.618236 )
								ret := -0.052632
							if( smoothK_k > 0.618236 )
								ret := 0.500000
				if( smoothD_d > 3.91731 )
					if( Positive_Money_Flow <= 1.34623e+07 )
						if( smoothK_k <= 96.2744 )
							if( Positive_Money_Flow_Sum <= 1.98413e+08 )
								if( Positive_Money_Flow_Sum <= 1.4665e+08 )
									ret := -0.030827
								if( Positive_Money_Flow_Sum > 1.4665e+08 )
									ret := -0.722222 // sell
							if( Positive_Money_Flow_Sum > 1.98413e+08 )
								ret := 0.933333 // buy
						if( smoothK_k > 96.2744 )
							if( Positive_Money_Flow <= 3.55402e+06 )
								if( d <= 97.8378 )
									ret := -0.058824
								if( d > 97.8378 )
									ret := -0.644231
							if( Positive_Money_Flow > 3.55402e+06 )
								if( Positive_Money_Flow <= 1.14059e+07 )
									ret := 0.055556
								if( Positive_Money_Flow > 1.14059e+07 )
									ret := -0.533333
					if( Positive_Money_Flow > 1.34623e+07 )
						if( Negative_Money_Flow_Sum <= 1.15864e+07 )
							if( smoothK_k <= 64.9383 )
								if( k <= 40.1301 )
									ret := 0.555556
								if( k > 40.1301 )
									ret := -0.416667
							if( smoothK_k > 64.9383 )
								if( Typical_Price <= 354.038 )
									ret := 0.254545
								if( Typical_Price > 354.038 )
									ret := 0.632653
						if( Negative_Money_Flow_Sum > 1.15864e+07 )
							if( Positive_Money_Flow <= 2.20653e+07 )
								if( Positive_Money_Flow <= 1.57965e+07 )
									ret := -0.523810
								if( Positive_Money_Flow > 1.57965e+07 )
									ret := 0.133333
							if( Positive_Money_Flow > 2.20653e+07 )
								ret := -0.916667 // sell
		if( Negative_Money_Flow_Sum > 1.31977e+07 )
			if( Negative_Money_Flow_Sum <= 1.8564e+07 )
				if( d <= 77.9981 )
					if( MFI_Low <= 35.0358 )
						if( MFI <= 52.2819 )
							if( Negative_Money_Flow_Sum <= 1.59401e+07 )
								if( Negative_Money_Flow <= 567552 )
									ret := 0.400000
								if( Negative_Money_Flow > 567552 )
									ret := -0.210526
							if( Negative_Money_Flow_Sum > 1.59401e+07 )
								if( d_k <= -1.61157 )
									ret := -0.750000 // sell
								if( d_k > -1.61157 )
									ret := -0.207792
						if( MFI > 52.2819 )
							if( d_k <= 13.8667 )
								if( Money_Flow_Ratio <= 1.11101 )
									ret := -0.857143 // sell
								if( Money_Flow_Ratio > 1.11101 )
									ret := -0.487805
							if( d_k > 13.8667 )
								ret := 0.444444
					if( MFI_Low > 35.0358 )
						if( MFI <= 62.1998 )
							if( MFI_Low <= 42.0525 )
								if( Typical_Price <= 130.403 )
									ret := 0.144654
								if( Typical_Price > 130.403 )
									ret := -0.148387
							if( MFI_Low > 42.0525 )
								ret := 0.785714 // buy
						if( MFI > 62.1998 )
							if( MFI <= 74.6646 )
								if( smoothK_k <= 90.1212 )
									ret := -0.301235
								if( smoothK_k > 90.1212 )
									ret := 0.636364
							if( MFI > 74.6646 )
								if( Negative_Money_Flow_Sum <= 1.38155e+07 )
									ret := -0.409091
								if( Negative_Money_Flow_Sum > 1.38155e+07 )
									ret := -0.082383
				if( d > 77.9981 )
					if( MFI_High <= 6.17568 )
						if( k <= 96.5429 )
							if( MFI_Low <= 60.3996 )
								if( Raw_Money_Flow <= 2.42369e+06 )
									ret := -0.116848
								if( Raw_Money_Flow > 2.42369e+06 )
									ret := 0.201507
							if( MFI_Low > 60.3996 )
								if( Positive_Money_Flow_Sum <= 6.21609e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 6.21609e+07 )
									ret := -0.290076
						if( k > 96.5429 )
							if( Raw_Money_Flow <= 1.07812e+07 )
								if( Positive_Money_Flow <= 4.94131e+06 )
									ret := -0.087413
								if( Positive_Money_Flow > 4.94131e+06 )
									ret := -0.459459
							if( Raw_Money_Flow > 1.07812e+07 )
								if( rsi1 <= 82.2795 )
									ret := -0.886364 // sell
								if( rsi1 > 82.2795 )
									ret := -0.400000
					if( MFI_High > 6.17568 )
						if( Negative_Money_Flow_Sum <= 1.36961e+07 )
							ret := -0.416667
						if( Negative_Money_Flow_Sum > 1.36961e+07 )
							if( Raw_Money_Flow <= 2.46974e+06 )
								if( Negative_Money_Flow <= 185489 )
									ret := 0.375000
								if( Negative_Money_Flow > 185489 )
									ret := 0.916667 // buy
							if( Raw_Money_Flow > 2.46974e+06 )
								if( k <= 96.2586 )
									ret := 0.053571
								if( k > 96.2586 )
									ret := 0.575758
			if( Negative_Money_Flow_Sum > 1.8564e+07 )
				if( MFI_Low <= 59.6808 )
					if( Money_Flow_Ratio <= 2.98453 )
						if( MFI_Low <= 51.846 )
							if( Positive_Money_Flow_Sum <= 5.15925e+07 )
								if( Money_Flow_Ratio <= 1.54163 )
									ret := -0.017926
								if( Money_Flow_Ratio > 1.54163 )
									ret := 0.100050
							if( Positive_Money_Flow_Sum > 5.15925e+07 )
								if( d_k <= 8.71014 )
									ret := -0.072378
								if( d_k > 8.71014 )
									ret := 0.041477
						if( MFI_Low > 51.846 )
							if( Typical_Price <= 300.697 )
								if( d_k <= 18.0421 )
									ret := 0.113924
								if( d_k > 18.0421 )
									ret := 0.909091 // buy
							if( Typical_Price > 300.697 )
								if( Negative_Money_Flow_Sum <= 5.86102e+07 )
									ret := -0.298597
								if( Negative_Money_Flow_Sum > 5.86102e+07 )
									ret := 0.047210
					if( Money_Flow_Ratio > 2.98453 )
						if( Typical_Price <= 656.73 )
							if( Raw_Money_Flow <= 8.21714e+06 )
								if( Positive_Money_Flow_Sum <= 9.86207e+07 )
									ret := 0.187008
								if( Positive_Money_Flow_Sum > 9.86207e+07 )
									ret := -0.118774
							if( Raw_Money_Flow > 8.21714e+06 )
								if( rsi1 <= 45.6855 )
									ret := 0.897959 // buy
								if( rsi1 > 45.6855 )
									ret := 0.165680
						if( Typical_Price > 656.73 )
							if( Negative_Money_Flow <= 1.22471e+07 )
								if( d <= 94.0326 )
									ret := -0.682353
								if( d > 94.0326 )
									ret := -0.235294
							if( Negative_Money_Flow > 1.22471e+07 )
								ret := 0.476190
				if( MFI_Low > 59.6808 )
					if( smoothK_k <= 10.4245 )
						if( Typical_Price <= 477.571 )
							if( rsi1 <= 67.5703 )
								if( Raw_Money_Flow <= 3.49544e+06 )
									ret := 0.370370
								if( Raw_Money_Flow > 3.49544e+06 )
									ret := 0.851064 // buy
							if( rsi1 > 67.5703 )
								ret := -0.727273 // sell
						if( Typical_Price > 477.571 )
							if( d <= 29.7808 )
								if( Raw_Money_Flow <= 2.0105e+06 )
									ret := 0.600000
								if( Raw_Money_Flow > 2.0105e+06 )
									ret := 0.050000
							if( d > 29.7808 )
								ret := -0.727273 // sell
					if( smoothK_k > 10.4245 )
						if( Raw_Money_Flow <= 9.74341e+07 )
							if( Positive_Money_Flow_Sum <= 1.06469e+08 )
								if( Money_Flow_Ratio <= 4.19664 )
									ret := -0.343284
								if( Money_Flow_Ratio > 4.19664 )
									ret := 0.422857
							if( Positive_Money_Flow_Sum > 1.06469e+08 )
								if( Negative_Money_Flow <= 5.99788e+06 )
									ret := -0.354975
								if( Negative_Money_Flow > 5.99788e+06 )
									ret := 0.093248
						if( Raw_Money_Flow > 9.74341e+07 )
							if( Money_Flow_Ratio <= 4.92988 )
								ret := 0.823529 // buy
							if( Money_Flow_Ratio > 4.92988 )
								ret := 0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_HUBS_15Min_c27f9410(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


