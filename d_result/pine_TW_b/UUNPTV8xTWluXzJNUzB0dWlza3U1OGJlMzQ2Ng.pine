//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: QCOM_1Min_2MS0_58be3466 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2MS0_58be3466", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_58be3466(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Money_Flow_Ratio <= 0.039479 )
		if( rsi1 <= 52.1929 )
			if( smoothK_k <= 4.94252 )
				if( k <= 0.622731 )
					if( d <= 6.49331 )
						if( MFI <= 2.98542 )
							if( Money_Flow_Ratio <= 0.022243 )
								ret := 0.555556
							if( Money_Flow_Ratio > 0.022243 )
								ret := 0.941176 // buy
						if( MFI > 2.98542 )
							ret := 0.285714
					if( d > 6.49331 )
						ret := 0.083333
				if( k > 0.622731 )
					if( Negative_Money_Flow_Sum <= 7.8899e+07 )
						if( Negative_Money_Flow_Sum <= 5.28984e+07 )
							if( smoothK_k <= 3.0452 )
								if( d_k <= 1.79064 )
									ret := 1.000000 // buy
								if( d_k > 1.79064 )
									ret := 0.666667
							if( smoothK_k > 3.0452 )
								ret := -0.166667
						if( Negative_Money_Flow_Sum > 5.28984e+07 )
							if( Money_Flow_Ratio <= 0.023919 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.023919 )
								ret := -0.454545
					if( Negative_Money_Flow_Sum > 7.8899e+07 )
						if( k <= 1.53227 )
							ret := 0.090909
						if( k > 1.53227 )
							if( rsi1 <= 24.7777 )
								ret := 0.642857
							if( rsi1 > 24.7777 )
								ret := 0.937500 // buy
			if( smoothK_k > 4.94252 )
				if( d_k <= -5.10012 )
					if( Negative_Money_Flow <= 76338.1 )
						if( Negative_Money_Flow_Sum <= 1.4046e+08 )
							if( smoothD_d <= 51.2841 )
								if( MFI_High <= -77.2858 )
									ret := -0.884615 // sell
								if( MFI_High > -77.2858 )
									ret := -0.692308
							if( smoothD_d > 51.2841 )
								ret := 0.294118
						if( Negative_Money_Flow_Sum > 1.4046e+08 )
							ret := 0.277778
					if( Negative_Money_Flow > 76338.1 )
						if( smoothK_k <= 37.1963 )
							if( Negative_Money_Flow_Sum <= 8.45579e+07 )
								ret := -0.909091 // sell
							if( Negative_Money_Flow_Sum > 8.45579e+07 )
								ret := 1.000000 // buy
						if( smoothK_k > 37.1963 )
							if( smoothK_k <= 57.283 )
								ret := 1.000000 // buy
							if( smoothK_k > 57.283 )
								ret := 0.533333
				if( d_k > -5.10012 )
					if( rsi1 <= 49.8877 )
						if( Money_Flow_Ratio <= 0.012119 )
							if( Positive_Money_Flow_Sum <= 547140 )
								if( MFI_Low <= -19.5314 )
									ret := 1.000000 // buy
								if( MFI_Low > -19.5314 )
									ret := 0.481481
							if( Positive_Money_Flow_Sum > 547140 )
								if( smoothD_d <= 19.0297 )
									ret := 0.800000 // buy
								if( smoothD_d > 19.0297 )
									ret := 0.984848 // buy
						if( Money_Flow_Ratio > 0.012119 )
							if( Money_Flow_Ratio <= 0.021597 )
								if( Raw_Money_Flow <= 1.04734e+07 )
									ret := 0.620690
								if( Raw_Money_Flow > 1.04734e+07 )
									ret := -0.100000
							if( Money_Flow_Ratio > 0.021597 )
								if( Negative_Money_Flow_Sum <= 7.09158e+07 )
									ret := 0.911565 // buy
								if( Negative_Money_Flow_Sum > 7.09158e+07 )
									ret := 0.512195
					if( rsi1 > 49.8877 )
						if( d_k <= 5.33827 )
							if( smoothK_k <= 57.9037 )
								ret := -0.357143
							if( smoothK_k > 57.9037 )
								ret := 0.538462
						if( d_k > 5.33827 )
							ret := 0.666667
		if( rsi1 > 52.1929 )
			if( Positive_Money_Flow_Sum <= 353866 )
				if( d <= 40.0793 )
					ret := -1.000000 // sell
				if( d > 40.0793 )
					ret := -0.750000 // sell
			if( Positive_Money_Flow_Sum > 353866 )
				if( Money_Flow_Ratio <= 0.012589 )
					if( Negative_Money_Flow <= 11148 )
						if( smoothD_d <= 66.9116 )
							ret := -0.312500
						if( smoothD_d > 66.9116 )
							if( Positive_Money_Flow_Sum <= 2.12647e+06 )
								ret := -0.875000 // sell
							if( Positive_Money_Flow_Sum > 2.12647e+06 )
								ret := -0.750000 // sell
					if( Negative_Money_Flow > 11148 )
						ret := 0.100000
				if( Money_Flow_Ratio > 0.012589 )
					if( Negative_Money_Flow_Sum <= 6.14345e+07 )
						if( MFI_High <= -77.1154 )
							if( Negative_Money_Flow_Sum <= 4.90806e+07 )
								ret := 0.375000
							if( Negative_Money_Flow_Sum > 4.90806e+07 )
								ret := 1.000000 // buy
						if( MFI_High > -77.1154 )
							if( d <= 50.5343 )
								ret := -0.750000 // sell
							if( d > 50.5343 )
								if( Positive_Money_Flow <= 3814.81 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow > 3814.81 )
									ret := 0.272727
					if( Negative_Money_Flow_Sum > 6.14345e+07 )
						if( Positive_Money_Flow <= 58280.5 )
							ret := 0.066667
						if( Positive_Money_Flow > 58280.5 )
							ret := -0.666667
	if( Money_Flow_Ratio > 0.039479 )
		if( d_k <= 0.194345 )
			if( Positive_Money_Flow <= 4819.68 )
				if( Raw_Money_Flow <= 88877.7 )
					if( d <= 57.013 )
						if( smoothD_d <= 9.0449 )
							if( Positive_Money_Flow_Sum <= 324568 )
								if( smoothK_k <= 7.7424 )
									ret := 0.687500
								if( smoothK_k > 7.7424 )
									ret := -0.230769
							if( Positive_Money_Flow_Sum > 324568 )
								if( d_k <= -0.480419 )
									ret := 0.056604
								if( d_k > -0.480419 )
									ret := -0.456522
						if( smoothD_d > 9.0449 )
							if( rsi1 <= 52.0889 )
								if( Positive_Money_Flow_Sum <= 218330 )
									ret := -0.313725
								if( Positive_Money_Flow_Sum > 218330 )
									ret := 0.460114
							if( rsi1 > 52.0889 )
								if( d <= 55.2136 )
									ret := 0.016667
								if( d > 55.2136 )
									ret := 0.687500
					if( d > 57.013 )
						if( Typical_Price <= 206.741 )
							if( Positive_Money_Flow_Sum <= 2.92624e+08 )
								if( rsi1 <= 50.653 )
									ret := 0.504950
								if( rsi1 > 50.653 )
									ret := -0.127202
							if( Positive_Money_Flow_Sum > 2.92624e+08 )
								if( k <= 99.5848 )
									ret := 0.625000
								if( k > 99.5848 )
									ret := 1.000000 // buy
						if( Typical_Price > 206.741 )
							if( rsi1 <= 60.9989 )
								if( smoothK_k <= 73.9395 )
									ret := -0.555556
								if( smoothK_k > 73.9395 )
									ret := -0.062500
							if( rsi1 > 60.9989 )
								if( smoothD_d <= 67.1848 )
									ret := -0.937500 // sell
								if( smoothD_d > 67.1848 )
									ret := -0.481481
				if( Raw_Money_Flow > 88877.7 )
					if( Positive_Money_Flow_Sum <= 7.65156e+06 )
						if( rsi1 <= 52.7621 )
							if( Typical_Price <= 158.413 )
								if( Typical_Price <= 151.757 )
									ret := 0.875000 // buy
								if( Typical_Price > 151.757 )
									ret := 0.307692
							if( Typical_Price > 158.413 )
								if( MFI_High <= -6.35054 )
									ret := -0.035122
								if( MFI_High > -6.35054 )
									ret := 0.869565 // buy
						if( rsi1 > 52.7621 )
							if( MFI <= 10.7872 )
								if( d <= 81.982 )
									ret := 0.782609 // buy
								if( d > 81.982 )
									ret := -0.416667
							if( MFI > 10.7872 )
								if( rsi1 <= 53.3643 )
									ret := -0.682927
								if( rsi1 > 53.3643 )
									ret := -0.187803
					if( Positive_Money_Flow_Sum > 7.65156e+06 )
						if( d <= 90.4676 )
							if( Negative_Money_Flow_Sum <= 7.17013e+06 )
								if( Raw_Money_Flow <= 1.07335e+06 )
									ret := 0.082019
								if( Raw_Money_Flow > 1.07335e+06 )
									ret := -0.492701
							if( Negative_Money_Flow_Sum > 7.17013e+06 )
								if( Typical_Price <= 211.243 )
									ret := 0.004796
								if( Typical_Price > 211.243 )
									ret := 0.163732
						if( d > 90.4676 )
							if( rsi1 <= 49.7492 )
								if( Negative_Money_Flow_Sum <= 6.39414e+07 )
									ret := 0.241071
								if( Negative_Money_Flow_Sum > 6.39414e+07 )
									ret := 0.885714 // buy
							if( rsi1 > 49.7492 )
								if( smoothD_d <= 89.2565 )
									ret := 0.406667
								if( smoothD_d > 89.2565 )
									ret := 0.025338
			if( Positive_Money_Flow > 4819.68 )
				if( Typical_Price <= 155.403 )
					if( Raw_Money_Flow <= 138873 )
						if( smoothD_d <= 30.6471 )
							ret := 0.666667
						if( smoothD_d > 30.6471 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 138873 )
						if( Negative_Money_Flow_Sum <= 1.8493e+06 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.8493e+06 )
							if( MFI <= 57.618 )
								if( Raw_Money_Flow <= 386142 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 386142 )
									ret := 0.904762 // buy
							if( MFI > 57.618 )
								ret := -0.142857
				if( Typical_Price > 155.403 )
					if( Negative_Money_Flow_Sum <= 3.2215e+08 )
						if( k <= 96.7509 )
							if( Negative_Money_Flow_Sum <= 4.34328e+06 )
								if( rsi1 <= 59.2839 )
									ret := -0.037788
								if( rsi1 > 59.2839 )
									ret := -0.222310
							if( Negative_Money_Flow_Sum > 4.34328e+06 )
								if( Positive_Money_Flow <= 55789 )
									ret := -0.345865
								if( Positive_Money_Flow > 55789 )
									ret := -0.033019
						if( k > 96.7509 )
							if( MFI <= 92.4021 )
								if( k <= 98.1703 )
									ret := 0.169118
								if( k > 98.1703 )
									ret := 0.009660
							if( MFI > 92.4021 )
								if( MFI_High <= 15.3094 )
									ret := -0.467290
								if( MFI_High > 15.3094 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 3.2215e+08 )
						if( MFI_High <= -66.8552 )
							if( Positive_Money_Flow <= 473895 )
								if( Typical_Price <= 181.028 )
									ret := -0.913043 // sell
								if( Typical_Price > 181.028 )
									ret := -0.333333
							if( Positive_Money_Flow > 473895 )
								if( rsi1 <= 49.5231 )
									ret := -1.000000 // sell
								if( rsi1 > 49.5231 )
									ret := -0.909091 // sell
						if( MFI_High > -66.8552 )
							if( Negative_Money_Flow_Sum <= 5.18511e+08 )
								if( k <= 37.2968 )
									ret := 0.363636
								if( k > 37.2968 )
									ret := -0.937500 // sell
							if( Negative_Money_Flow_Sum > 5.18511e+08 )
								if( Negative_Money_Flow_Sum <= 6.32981e+08 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 6.32981e+08 )
									ret := -0.272727
		if( d_k > 0.194345 )
			if( Money_Flow_Ratio <= 2.86628 )
				if( rsi1 <= 56.0399 )
					if( Raw_Money_Flow <= 1.89378e+06 )
						if( Negative_Money_Flow_Sum <= 421561 )
							if( smoothD_d <= 63.3036 )
								if( Negative_Money_Flow <= 22991 )
									ret := 0.341463
								if( Negative_Money_Flow > 22991 )
									ret := 0.699248
							if( smoothD_d > 63.3036 )
								if( Typical_Price <= 166.212 )
									ret := -0.360000
								if( Typical_Price > 166.212 )
									ret := 0.171875
						if( Negative_Money_Flow_Sum > 421561 )
							if( Negative_Money_Flow_Sum <= 7.3519e+07 )
								if( Positive_Money_Flow_Sum <= 693384 )
									ret := 0.149566
								if( Positive_Money_Flow_Sum > 693384 )
									ret := 0.053369
							if( Negative_Money_Flow_Sum > 7.3519e+07 )
								if( Raw_Money_Flow <= 637544 )
									ret := 0.251012
								if( Raw_Money_Flow > 637544 )
									ret := 0.729730 // buy
					if( Raw_Money_Flow > 1.89378e+06 )
						if( Typical_Price <= 168.546 )
							if( d_k <= 14.174 )
								if( MFI <= 50.1571 )
									ret := 0.060206
								if( MFI > 50.1571 )
									ret := -0.127786
							if( d_k > 14.174 )
								if( Negative_Money_Flow_Sum <= 4.13179e+07 )
									ret := 0.313305
								if( Negative_Money_Flow_Sum > 4.13179e+07 )
									ret := -0.400000
						if( Typical_Price > 168.546 )
							if( Negative_Money_Flow_Sum <= 6.65895e+06 )
								if( Money_Flow_Ratio <= 1.62145 )
									ret := 0.700000 // buy
								if( Money_Flow_Ratio > 1.62145 )
									ret := -0.454545
							if( Negative_Money_Flow_Sum > 6.65895e+06 )
								if( Positive_Money_Flow_Sum <= 1.19618e+08 )
									ret := -0.084663
								if( Positive_Money_Flow_Sum > 1.19618e+08 )
									ret := 0.683871
				if( rsi1 > 56.0399 )
					if( Negative_Money_Flow_Sum <= 6.07279e+07 )
						if( Negative_Money_Flow_Sum <= 3.23236e+07 )
							if( Negative_Money_Flow_Sum <= 3.1578e+07 )
								if( MFI_Low <= 50.8603 )
									ret := -0.066886
								if( MFI_Low > 50.8603 )
									ret := 0.028571
							if( Negative_Money_Flow_Sum > 3.1578e+07 )
								if( d <= 62.6635 )
									ret := -0.222222
								if( d > 62.6635 )
									ret := -0.795455 // sell
						if( Negative_Money_Flow_Sum > 3.23236e+07 )
							if( Raw_Money_Flow <= 1.88515e+06 )
								if( smoothK_k <= 78.6754 )
									ret := -1.000000 // sell
								if( smoothK_k > 78.6754 )
									ret := -0.600000
							if( Raw_Money_Flow > 1.88515e+06 )
								if( MFI_Low <= 8.65852 )
									ret := -0.448276
								if( MFI_Low > 8.65852 )
									ret := 0.257895
					if( Negative_Money_Flow_Sum > 6.07279e+07 )
						if( Typical_Price <= 158.71 )
							ret := 1.000000 // buy
						if( Typical_Price > 158.71 )
							if( k <= 90.2336 )
								if( smoothK_k <= 3.34345 )
									ret := 0.500000
								if( smoothK_k > 3.34345 )
									ret := -0.446809
							if( k > 90.2336 )
								if( Positive_Money_Flow_Sum <= 2.06728e+08 )
									ret := 0.160714
								if( Positive_Money_Flow_Sum > 2.06728e+08 )
									ret := -0.555556
			if( Money_Flow_Ratio > 2.86628 )
				if( Negative_Money_Flow <= 1947.13 )
					if( MFI_Low <= 59.7951 )
						if( Money_Flow_Ratio <= 3.5098 )
							if( smoothD_d <= 32.7064 )
								if( MFI_Low <= 54.4453 )
									ret := 0.950000 // buy
								if( MFI_Low > 54.4453 )
									ret := 0.238095
							if( smoothD_d > 32.7064 )
								if( Positive_Money_Flow <= 7.4959e+06 )
									ret := -0.023339
								if( Positive_Money_Flow > 7.4959e+06 )
									ret := 0.450980
						if( Money_Flow_Ratio > 3.5098 )
							if( smoothD_d <= 46.1499 )
								if( Typical_Price <= 167.77 )
									ret := 0.666667
								if( Typical_Price > 167.77 )
									ret := -0.225000
							if( smoothD_d > 46.1499 )
								if( d_k <= 13.521 )
									ret := 0.286364
								if( d_k > 13.521 )
									ret := 0.673913
					if( MFI_Low > 59.7951 )
						if( Positive_Money_Flow_Sum <= 7.93209e+06 )
							if( MFI_High <= 2.89324 )
								if( d <= 39.1186 )
									ret := 0.333333
								if( d > 39.1186 )
									ret := -0.352941
							if( MFI_High > 2.89324 )
								if( Raw_Money_Flow <= 102080 )
									ret := -0.318182
								if( Raw_Money_Flow > 102080 )
									ret := -0.728261 // sell
						if( Positive_Money_Flow_Sum > 7.93209e+06 )
							if( MFI_Low <= 62.462 )
								if( Positive_Money_Flow_Sum <= 3.89585e+07 )
									ret := -0.086420
								if( Positive_Money_Flow_Sum > 3.89585e+07 )
									ret := -0.580247
							if( MFI_Low > 62.462 )
								if( MFI_High <= 11.5901 )
									ret := 0.164675
								if( MFI_High > 11.5901 )
									ret := -0.122324
				if( Negative_Money_Flow > 1947.13 )
					if( Typical_Price <= 174.905 )
						if( MFI_High <= -3.13264 )
							if( Raw_Money_Flow <= 839193 )
								if( Positive_Money_Flow_Sum <= 4.5032e+06 )
									ret := 0.710526 // buy
								if( Positive_Money_Flow_Sum > 4.5032e+06 )
									ret := -0.237288
							if( Raw_Money_Flow > 839193 )
								if( smoothK_k <= 38.4663 )
									ret := -0.263158
								if( smoothK_k > 38.4663 )
									ret := 0.588608
						if( MFI_High > -3.13264 )
							if( smoothK_k <= 8.33023 )
								if( Negative_Money_Flow <= 305030 )
									ret := 0.676471
								if( Negative_Money_Flow > 305030 )
									ret := -0.071429
							if( smoothK_k > 8.33023 )
								if( rsi1 <= 47.3376 )
									ret := 0.483516
								if( rsi1 > 47.3376 )
									ret := -0.011264
					if( Typical_Price > 174.905 )
						if( Positive_Money_Flow_Sum <= 1.01806e+08 )
							if( Positive_Money_Flow_Sum <= 9.64664e+07 )
								if( MFI <= 80.2882 )
									ret := 0.321678
								if( MFI > 80.2882 )
									ret := 0.051813
							if( Positive_Money_Flow_Sum > 9.64664e+07 )
								if( Raw_Money_Flow <= 5.73946e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 5.73946e+06 )
									ret := -0.969697 // sell
						if( Positive_Money_Flow_Sum > 1.01806e+08 )
							if( d_k <= 0.84537 )
								if( Positive_Money_Flow_Sum <= 2.98423e+08 )
									ret := -0.272727
								if( Positive_Money_Flow_Sum > 2.98423e+08 )
									ret := 0.500000
							if( d_k > 0.84537 )
								if( MFI <= 93.7413 )
									ret := 0.674897
								if( MFI > 93.7413 )
									ret := 0.306122
	
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
float op_operation = decision_tree_0_QCOM_1Min_58be3466(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


