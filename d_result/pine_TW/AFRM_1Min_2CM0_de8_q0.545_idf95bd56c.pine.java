//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AFRM_1Min_2CM0_f95bd56c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2CM0_f95bd56c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_f95bd56c(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 92156.9 )
		if( Raw_Money_Flow <= 24823 )
			if( Positive_Money_Flow <= 2681 )
				if( Raw_Money_Flow <= 8668.37 )
					if( MFI_High <= -57.0568 )
						if( mf <= 0.383052 )
							if( Money_Flow_Ratio <= 0.219491 )
								if( Positive_Money_Flow <= 224.534 )
									ret := 0.359155
								if( Positive_Money_Flow > 224.534 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.219491 )
								if( mf <= -0.313876 )
									ret := 0.972222 // buy
								if( mf > -0.313876 )
									ret := 0.614035
						if( mf > 0.383052 )
							if( Raw_Money_Flow <= 5080.43 )
								ret := -0.181818
							if( Raw_Money_Flow > 5080.43 )
								ret := 0.000000
					if( MFI_High > -57.0568 )
						if( MFI_Low <= 17.6747 )
							if( Positive_Money_Flow_Sum <= 49577.3 )
								if( Raw_Money_Flow <= 5290.93 )
									ret := -0.636364
								if( Raw_Money_Flow > 5290.93 )
									ret := 0.322581
							if( Positive_Money_Flow_Sum > 49577.3 )
								if( MFI_Low <= 4.01961 )
									ret := -0.333333
								if( MFI_Low > 4.01961 )
									ret := 0.347368
						if( MFI_Low > 17.6747 )
							if( Negative_Money_Flow <= 109.299 )
								if( Positive_Money_Flow_Sum <= 50166.5 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 50166.5 )
									ret := 0.455882
							if( Negative_Money_Flow > 109.299 )
								if( Positive_Money_Flow_Sum <= 81788.3 )
									ret := 0.676056
								if( Positive_Money_Flow_Sum > 81788.3 )
									ret := 0.358209
				if( Raw_Money_Flow > 8668.37 )
					if( Negative_Money_Flow <= 17264.1 )
						if( ad_mf <= 0.139894 )
							if( mf <= -0.342746 )
								ret := -0.916667 // sell
							if( mf > -0.342746 )
								if( Negative_Money_Flow_Sum <= 87659.3 )
									ret := 0.493976
								if( Negative_Money_Flow_Sum > 87659.3 )
									ret := 0.123457
						if( ad_mf > 0.139894 )
							if( MFI_High <= -75.3411 )
								ret := 0.650000
							if( MFI_High > -75.3411 )
								if( Positive_Money_Flow_Sum <= 53125 )
									ret := 0.163934
								if( Positive_Money_Flow_Sum > 53125 )
									ret := -0.394872
					if( Negative_Money_Flow > 17264.1 )
						if( MFI_Low <= 13.7892 )
							if( mf <= -0.374259 )
								if( mf <= -0.415508 )
									ret := 0.200000
								if( mf > -0.415508 )
									ret := -0.666667
							if( mf > -0.374259 )
								if( MFI_Low <= -4.78616 )
									ret := 0.096774
								if( MFI_Low > -4.78616 )
									ret := 0.550000
						if( MFI_Low > 13.7892 )
							if( Negative_Money_Flow_Sum <= 128893 )
								if( ad_mf <= 0.367175 )
									ret := -0.119048
								if( ad_mf > 0.367175 )
									ret := 0.695652
							if( Negative_Money_Flow_Sum > 128893 )
								ret := -0.312500
			if( Positive_Money_Flow > 2681 )
				if( MFI <= 70.6483 )
					if( MFI <= 56.413 )
						if( ad <= -0.919396 )
							if( Money_Flow_Ratio <= 0.234578 )
								if( Money_Flow_Ratio <= 0.190041 )
									ret := 0.333333
								if( Money_Flow_Ratio > 0.190041 )
									ret := -0.916667 // sell
							if( Money_Flow_Ratio > 0.234578 )
								if( Positive_Money_Flow <= 19661.9 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow > 19661.9 )
									ret := 0.100000
						if( ad > -0.919396 )
							if( MFI_High <= -33.9605 )
								if( Negative_Money_Flow_Sum <= 100083 )
									ret := -0.368794
								if( Negative_Money_Flow_Sum > 100083 )
									ret := -0.060484
							if( MFI_High > -33.9605 )
								if( MFI_High <= -33.4068 )
									ret := 0.894737 // buy
								if( MFI_High > -33.4068 )
									ret := 0.000000
					if( MFI > 56.413 )
						if( ad_mf <= -0.145933 )
							ret := 0.238095
						if( ad_mf > -0.145933 )
							if( ad_mf <= 46.6468 )
								if( Positive_Money_Flow_Sum <= 86440.7 )
									ret := -0.650000
								if( Positive_Money_Flow_Sum > 86440.7 )
									ret := -1.000000 // sell
							if( ad_mf > 46.6468 )
								ret := 0.133333
				if( MFI > 70.6483 )
					ret := 0.708333 // buy
		if( Raw_Money_Flow > 24823 )
			if( MFI <= 0.070709 )
				if( Negative_Money_Flow <= 3.30666e+06 )
					ret := -0.428571
				if( Negative_Money_Flow > 3.30666e+06 )
					ret := -0.909091 // sell
			if( MFI > 0.070709 )
				if( ad_mf <= 479.479 )
					if( Negative_Money_Flow_Sum <= 60156.7 )
						ret := -0.571429
					if( Negative_Money_Flow_Sum > 60156.7 )
						if( Negative_Money_Flow <= 2160.73 )
							if( Positive_Money_Flow_Sum <= 66728.5 )
								if( MFI_High <= -53.7697 )
									ret := 0.111111
								if( MFI_High > -53.7697 )
									ret := 0.629630
							if( Positive_Money_Flow_Sum > 66728.5 )
								if( MFI_High <= -28.5264 )
									ret := -0.412500
								if( MFI_High > -28.5264 )
									ret := 0.533333
						if( Negative_Money_Flow > 2160.73 )
							if( MFI_Low <= -8.20615 )
								if( Positive_Money_Flow_Sum <= 55334.6 )
									ret := 0.056452
								if( Positive_Money_Flow_Sum > 55334.6 )
									ret := 0.532110
							if( MFI_Low > -8.20615 )
								if( MFI_High <= -37.7133 )
									ret := 0.589322
								if( MFI_High > -37.7133 )
									ret := -0.050000
				if( ad_mf > 479.479 )
					if( Money_Flow_Ratio <= 0.824849 )
						if( ad_mf <= 3426.42 )
							if( Typical_Price <= 29.1713 )
								if( Positive_Money_Flow_Sum <= 52633.7 )
									ret := 0.636364
								if( Positive_Money_Flow_Sum > 52633.7 )
									ret := 0.000000
							if( Typical_Price > 29.1713 )
								if( Raw_Money_Flow <= 96507.7 )
									ret := -0.115385
								if( Raw_Money_Flow > 96507.7 )
									ret := -1.000000 // sell
						if( ad_mf > 3426.42 )
							if( mf <= -0.151697 )
								ret := -0.181818
							if( mf > -0.151697 )
								if( Positive_Money_Flow_Sum <= 55007.6 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 55007.6 )
									ret := 0.615385
					if( Money_Flow_Ratio > 0.824849 )
						if( Positive_Money_Flow <= 33978.3 )
							ret := 0.450000
						if( Positive_Money_Flow > 33978.3 )
							ret := 0.888889 // buy
	if( Positive_Money_Flow_Sum > 92156.9 )
		if( ad <= 1.39161 )
			if( Positive_Money_Flow <= 905181 )
				if( Negative_Money_Flow_Sum <= 4.82619e+06 )
					if( MFI <= 56.6923 )
						if( MFI <= 38.3311 )
							if( Raw_Money_Flow <= 1.26459e+06 )
								if( Positive_Money_Flow <= 30.2744 )
									ret := 0.056196
								if( Positive_Money_Flow > 30.2744 )
									ret := -0.079010
							if( Raw_Money_Flow > 1.26459e+06 )
								if( MFI <= 15.0279 )
									ret := 0.142857
								if( MFI > 15.0279 )
									ret := 0.651163
						if( MFI > 38.3311 )
							if( Negative_Money_Flow_Sum <= 536268 )
								if( ad <= -17.8066 )
									ret := 0.317125
								if( ad > -17.8066 )
									ret := 0.134570
							if( Negative_Money_Flow_Sum > 536268 )
								if( Money_Flow_Ratio <= 0.860494 )
									ret := 0.125619
								if( Money_Flow_Ratio > 0.860494 )
									ret := 0.010260
					if( MFI > 56.6923 )
						if( MFI_High <= -1.96102 )
							if( Money_Flow_Ratio <= 2.68316 )
								if( Raw_Money_Flow <= 807351 )
									ret := -0.019090
								if( Raw_Money_Flow > 807351 )
									ret := 0.192020
							if( Money_Flow_Ratio > 2.68316 )
								if( Negative_Money_Flow_Sum <= 50284.5 )
									ret := 0.534247
								if( Negative_Money_Flow_Sum > 50284.5 )
									ret := -0.147215
						if( MFI_High > -1.96102 )
							if( ad_mf <= -14522 )
								if( Raw_Money_Flow <= 720302 )
									ret := 0.115942
								if( Raw_Money_Flow > 720302 )
									ret := 0.576355
							if( ad_mf > -14522 )
								if( ad <= -0.535196 )
									ret := 0.100307
								if( ad > -0.535196 )
									ret := -0.030920
				if( Negative_Money_Flow_Sum > 4.82619e+06 )
					if( Negative_Money_Flow <= 2.35968e+07 )
						if( Negative_Money_Flow_Sum <= 5.79975e+06 )
							if( MFI <= 8.67069 )
								if( Negative_Money_Flow <= 315470 )
									ret := 0.076923
								if( Negative_Money_Flow > 315470 )
									ret := 0.764706 // buy
							if( MFI > 8.67069 )
								if( mf <= 0.16591 )
									ret := -0.281690
								if( mf > 0.16591 )
									ret := 0.114943
						if( Negative_Money_Flow_Sum > 5.79975e+06 )
							if( MFI_Low <= 22.1873 )
								if( MFI_Low <= 19.0732 )
									ret := -0.024462
								if( MFI_Low > 19.0732 )
									ret := -0.314861
							if( MFI_Low > 22.1873 )
								if( Money_Flow_Ratio <= 0.931848 )
									ret := 0.200299
								if( Money_Flow_Ratio > 0.931848 )
									ret := 0.019558
					if( Negative_Money_Flow > 2.35968e+07 )
						if( ad_mf <= -451482 )
							ret := 0.958333 // buy
						if( ad_mf > -451482 )
							ret := 0.700000 // buy
			if( Positive_Money_Flow > 905181 )
				if( mf <= 0.153578 )
					if( Positive_Money_Flow <= 1.74577e+06 )
						if( Money_Flow_Ratio <= 2.82578 )
							if( Negative_Money_Flow_Sum <= 3.17724e+07 )
								if( Negative_Money_Flow_Sum <= 1.98809e+07 )
									ret := 0.151272
								if( Negative_Money_Flow_Sum > 1.98809e+07 )
									ret := 0.690476
							if( Negative_Money_Flow_Sum > 3.17724e+07 )
								ret := -0.941176 // sell
						if( Money_Flow_Ratio > 2.82578 )
							if( Positive_Money_Flow_Sum <= 1.91265e+07 )
								if( Positive_Money_Flow <= 1.2346e+06 )
									ret := 0.159091
								if( Positive_Money_Flow > 1.2346e+06 )
									ret := -0.585714
							if( Positive_Money_Flow_Sum > 1.91265e+07 )
								ret := 0.263158
					if( Positive_Money_Flow > 1.74577e+06 )
						if( MFI_High <= -7.55976 )
							if( MFI <= 50.3497 )
								if( MFI_High <= -37.6703 )
									ret := 0.382022
								if( MFI_High > -37.6703 )
									ret := -0.136364
							if( MFI > 50.3497 )
								if( Typical_Price <= 39.4287 )
									ret := 0.331210
								if( Typical_Price > 39.4287 )
									ret := 0.681818
						if( MFI_High > -7.55976 )
							if( Positive_Money_Flow_Sum <= 2.60778e+06 )
								ret := 0.909091 // buy
							if( Positive_Money_Flow_Sum > 2.60778e+06 )
								if( Typical_Price <= 31.0684 )
									ret := -0.371429
								if( Typical_Price > 31.0684 )
									ret := 0.171674
				if( mf > 0.153578 )
					if( Positive_Money_Flow_Sum <= 3.23028e+07 )
						if( MFI_High <= 9.32432 )
							if( Negative_Money_Flow_Sum <= 2.49726e+06 )
								if( Raw_Money_Flow <= 1.23574e+06 )
									ret := 0.166667
								if( Raw_Money_Flow > 1.23574e+06 )
									ret := -0.491525
							if( Negative_Money_Flow_Sum > 2.49726e+06 )
								if( MFI_High <= 1.43505 )
									ret := 0.051724
								if( MFI_High > 1.43505 )
									ret := 0.704545 // buy
						if( MFI_High > 9.32432 )
							if( ad_mf <= -19620.6 )
								ret := 0.250000
							if( ad_mf > -19620.6 )
								if( MFI <= 91.5516 )
									ret := 1.000000 // buy
								if( MFI > 91.5516 )
									ret := 0.680000
					if( Positive_Money_Flow_Sum > 3.23028e+07 )
						if( Positive_Money_Flow <= 1.62429e+06 )
							ret := 0.545455
						if( Positive_Money_Flow > 1.62429e+06 )
							if( Positive_Money_Flow_Sum <= 4.64825e+07 )
								if( MFI <= 87.7974 )
									ret := -0.918919 // sell
								if( MFI > 87.7974 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.64825e+07 )
								if( ad_mf <= -30191.3 )
									ret := 0.250000
								if( ad_mf > -30191.3 )
									ret := -0.611111
		if( ad > 1.39161 )
			if( Positive_Money_Flow_Sum <= 1.00661e+06 )
				if( MFI_High <= -12.2718 )
					if( Negative_Money_Flow <= 1.48805e+06 )
						if( Money_Flow_Ratio <= 0.089637 )
							if( MFI_High <= -73.7802 )
								if( mf <= -0.365134 )
									ret := -0.705882 // sell
								if( mf > -0.365134 )
									ret := 0.250000
							if( MFI_High > -73.7802 )
								if( Negative_Money_Flow_Sum <= 4.73461e+06 )
									ret := 0.074074
								if( Negative_Money_Flow_Sum > 4.73461e+06 )
									ret := 0.666667
						if( Money_Flow_Ratio > 0.089637 )
							if( Raw_Money_Flow <= 9091.12 )
								if( Raw_Money_Flow <= 5642.66 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 5642.66 )
									ret := -0.482353
							if( Raw_Money_Flow > 9091.12 )
								if( ad <= 3643.17 )
									ret := -0.129541
								if( ad > 3643.17 )
									ret := -0.003911
					if( Negative_Money_Flow > 1.48805e+06 )
						if( MFI_Low <= -14.8395 )
							if( mf <= 0.046746 )
								ret := -0.777778 // sell
							if( mf > 0.046746 )
								ret := 0.333333
						if( MFI_Low > -14.8395 )
							if( Raw_Money_Flow <= 2.86718e+06 )
								if( ad_mf <= 40605.4 )
									ret := -1.000000 // sell
								if( ad_mf > 40605.4 )
									ret := -0.916667 // sell
							if( Raw_Money_Flow > 2.86718e+06 )
								ret := -0.400000
				if( MFI_High > -12.2718 )
					if( mf <= 0.36117 )
						if( mf <= -0.173605 )
							if( Negative_Money_Flow_Sum <= 86207.8 )
								ret := -0.333333
							if( Negative_Money_Flow_Sum > 86207.8 )
								if( Raw_Money_Flow <= 23278.3 )
									ret := -0.608696
								if( Raw_Money_Flow > 23278.3 )
									ret := -0.941176 // sell
						if( mf > -0.173605 )
							if( Typical_Price <= 22.6959 )
								ret := 0.600000
							if( Typical_Price > 22.6959 )
								if( Negative_Money_Flow <= 42462.6 )
									ret := -0.293421
								if( Negative_Money_Flow > 42462.6 )
									ret := 0.258065
					if( mf > 0.36117 )
						if( Positive_Money_Flow_Sum <= 482421 )
							if( MFI_High <= -0.264352 )
								if( Money_Flow_Ratio <= 3.03013 )
									ret := -0.142857
								if( Money_Flow_Ratio > 3.03013 )
									ret := -0.638889
							if( MFI_High > -0.264352 )
								if( MFI_High <= 3.93867 )
									ret := 0.608696
								if( MFI_High > 3.93867 )
									ret := -0.210526
						if( Positive_Money_Flow_Sum > 482421 )
							if( Negative_Money_Flow_Sum <= 266642 )
								if( Typical_Price <= 26.3363 )
									ret := -0.272727
								if( Typical_Price > 26.3363 )
									ret := -0.859649 // sell
							if( Negative_Money_Flow_Sum > 266642 )
								if( Raw_Money_Flow <= 77491.2 )
									ret := 0.777778 // buy
								if( Raw_Money_Flow > 77491.2 )
									ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 1.00661e+06 )
				if( Negative_Money_Flow_Sum <= 2.21172e+07 )
					if( Negative_Money_Flow_Sum <= 1.09795e+07 )
						if( Negative_Money_Flow <= 1.69955e+06 )
							if( Typical_Price <= 24.1833 )
								if( MFI_Low <= 72.4585 )
									ret := 0.888889 // buy
								if( MFI_Low > 72.4585 )
									ret := 0.333333
							if( Typical_Price > 24.1833 )
								if( ad <= 7128.57 )
									ret := -0.052666
								if( ad > 7128.57 )
									ret := 0.009776
						if( Negative_Money_Flow > 1.69955e+06 )
							if( Negative_Money_Flow_Sum <= 2.88754e+06 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 2.88754e+06 )
								if( Negative_Money_Flow <= 2.08809e+06 )
									ret := 0.735632 // buy
								if( Negative_Money_Flow > 2.08809e+06 )
									ret := 0.385417
					if( Negative_Money_Flow_Sum > 1.09795e+07 )
						if( Positive_Money_Flow_Sum <= 2.38111e+07 )
							if( MFI_High <= -34.6563 )
								if( MFI_Low <= 5.79167 )
									ret := -0.065630
								if( MFI_Low > 5.79167 )
									ret := -0.282076
							if( MFI_High > -34.6563 )
								if( ad_mf <= 2319.93 )
									ret := -0.500000
								if( ad_mf > 2319.93 )
									ret := 0.158809
						if( Positive_Money_Flow_Sum > 2.38111e+07 )
							if( Positive_Money_Flow_Sum <= 1.04395e+08 )
								if( Raw_Money_Flow <= 2.25341e+06 )
									ret := -0.714286 // sell
								if( Raw_Money_Flow > 2.25341e+06 )
									ret := -0.358804
							if( Positive_Money_Flow_Sum > 1.04395e+08 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 2.21172e+07 )
					if( MFI_Low <= 2.32698 )
						if( Raw_Money_Flow <= 1.74309e+06 )
							if( Raw_Money_Flow <= 74298.8 )
								if( MFI_Low <= -11.4793 )
									ret := -0.777778 // sell
								if( MFI_Low > -11.4793 )
									ret := 0.250000
							if( Raw_Money_Flow > 74298.8 )
								if( Negative_Money_Flow_Sum <= 3.99491e+07 )
									ret := 0.821429 // buy
								if( Negative_Money_Flow_Sum > 3.99491e+07 )
									ret := 0.360000
						if( Raw_Money_Flow > 1.74309e+06 )
							if( MFI_Low <= -11.6045 )
								if( Typical_Price <= 44.4423 )
									ret := 0.625000
								if( Typical_Price > 44.4423 )
									ret := -0.400000
							if( MFI_Low > -11.6045 )
								if( Positive_Money_Flow_Sum <= 4.49871e+06 )
									ret := 0.076923
								if( Positive_Money_Flow_Sum > 4.49871e+06 )
									ret := -0.642857
					if( MFI_Low > 2.32698 )
						if( Positive_Money_Flow_Sum <= 5.29187e+07 )
							if( Money_Flow_Ratio <= 0.977693 )
								if( mf <= -0.092684 )
									ret := 0.135531
								if( mf > -0.092684 )
									ret := 0.448430
							if( Money_Flow_Ratio > 0.977693 )
								if( Raw_Money_Flow <= 6.01453e+06 )
									ret := 0.581081
								if( Raw_Money_Flow > 6.01453e+06 )
									ret := 0.969697 // buy
						if( Positive_Money_Flow_Sum > 5.29187e+07 )
							if( MFI_Low <= 26.005 )
								ret := 1.000000 // buy
							if( MFI_Low > 26.005 )
								if( Typical_Price <= 39.9286 )
									ret := -1.000000 // sell
								if( Typical_Price > 39.9286 )
									ret := -0.110000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_AFRM_1Min_f95bd56c(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


