//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: GME_15Min_2MM0_32a8cdf6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_2MM0_32a8cdf6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_32a8cdf6(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 2.33112e+06 )
		if( Positive_Money_Flow <= 0.623294 )
			if( Short_Long_Diff <= -0.167884 )
				if( Negative_Money_Flow_Sum <= 1.88175e+06 )
					if( Typical_Price <= 20.9617 )
						if( Long_MA <= 14.7733 )
							ret := 0.125000
						if( Long_MA > 14.7733 )
							if( Negative_Money_Flow <= 23345.3 )
								ret := 0.947368 // buy
							if( Negative_Money_Flow > 23345.3 )
								if( Negative_Money_Flow <= 112733 )
									ret := 0.600000
								if( Negative_Money_Flow > 112733 )
									ret := 0.777778 // buy
					if( Typical_Price > 20.9617 )
						if( Negative_Money_Flow <= 31373.1 )
							if( Short_MA <= 138.253 )
								if( Positive_Money_Flow_Sum <= 1.65536e+06 )
									ret := 0.439024
								if( Positive_Money_Flow_Sum > 1.65536e+06 )
									ret := 1.000000 // buy
							if( Short_MA > 138.253 )
								ret := 0.000000
						if( Negative_Money_Flow > 31373.1 )
							if( MFI_Low <= 19.3661 )
								if( Negative_Money_Flow_Sum <= 923648 )
									ret := -0.520000
								if( Negative_Money_Flow_Sum > 923648 )
									ret := 0.041176
							if( MFI_Low > 19.3661 )
								if( Short_MA <= 159.975 )
									ret := 0.461538
								if( Short_MA > 159.975 )
									ret := -0.363636
				if( Negative_Money_Flow_Sum > 1.88175e+06 )
					if( Short_Long_Diff <= -0.75276 )
						if( Short_Long_Diff <= -1.47289 )
							ret := 0.523810
						if( Short_Long_Diff > -1.47289 )
							ret := 0.055556
					if( Short_Long_Diff > -0.75276 )
						if( Typical_Price <= 28.0579 )
							ret := 0.727273 // buy
						if( Typical_Price > 28.0579 )
							if( Short_MA <= 154.906 )
								ret := 1.000000 // buy
							if( Short_MA > 154.906 )
								ret := 0.750000 // buy
			if( Short_Long_Diff > -0.167884 )
				if( Positive_Money_Flow_Sum <= 5.97453e+06 )
					if( Negative_Money_Flow <= 3955.12 )
						if( Short_MA <= 8.21059 )
							if( Negative_Money_Flow_Sum <= 2.03119e+06 )
								if( Positive_Money_Flow_Sum <= 1.48218e+06 )
									ret := 0.680272
								if( Positive_Money_Flow_Sum > 1.48218e+06 )
									ret := 0.339744
							if( Negative_Money_Flow_Sum > 2.03119e+06 )
								if( Negative_Money_Flow <= 1517.89 )
									ret := -0.382353
								if( Negative_Money_Flow > 1517.89 )
									ret := 0.076923
						if( Short_MA > 8.21059 )
							if( Positive_Money_Flow_Sum <= 4.06005e+06 )
								if( Money_Flow_Ratio <= 2.01645 )
									ret := -0.043353
								if( Money_Flow_Ratio > 2.01645 )
									ret := 0.208861
							if( Positive_Money_Flow_Sum > 4.06005e+06 )
								if( Long_MA <= 14.3286 )
									ret := -0.428571
								if( Long_MA > 14.3286 )
									ret := -0.615385
					if( Negative_Money_Flow > 3955.12 )
						if( Short_Long_Diff <= 0.001186 )
							if( Raw_Money_Flow <= 507122 )
								if( Short_Long_Diff <= -0.000923 )
									ret := -0.023690
								if( Short_Long_Diff > -0.000923 )
									ret := 0.353982
							if( Raw_Money_Flow > 507122 )
								if( Negative_Money_Flow_Sum <= 1.49895e+06 )
									ret := 0.594059
								if( Negative_Money_Flow_Sum > 1.49895e+06 )
									ret := 0.123288
						if( Short_Long_Diff > 0.001186 )
							if( MFI_Low <= -16.4006 )
								if( Money_Flow_Ratio <= 0.028715 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.028715 )
									ret := -0.461538
							if( MFI_Low > -16.4006 )
								if( Raw_Money_Flow <= 1.03517e+06 )
									ret := -0.089431
								if( Raw_Money_Flow > 1.03517e+06 )
									ret := 0.268908
				if( Positive_Money_Flow_Sum > 5.97453e+06 )
					if( Money_Flow_Ratio <= 3.22505 )
						if( Long_MA <= 20.0046 )
							if( MFI <= 75.1366 )
								ret := 1.000000 // buy
							if( MFI > 75.1366 )
								ret := 0.857143 // buy
						if( Long_MA > 20.0046 )
							ret := 0.571429
					if( Money_Flow_Ratio > 3.22505 )
						if( Negative_Money_Flow <= 63522.4 )
							if( MFI_Low <= 63.6481 )
								if( Short_MA <= 5.4793 )
									ret := 0.875000 // buy
								if( Short_MA > 5.4793 )
									ret := 0.290323
							if( MFI_Low > 63.6481 )
								if( Negative_Money_Flow <= 9207.05 )
									ret := -0.172619
								if( Negative_Money_Flow > 9207.05 )
									ret := 0.082192
						if( Negative_Money_Flow > 63522.4 )
							if( Raw_Money_Flow <= 947727 )
								if( Long_MA <= 30.3867 )
									ret := 0.289617
								if( Long_MA > 30.3867 )
									ret := 0.666667
							if( Raw_Money_Flow > 947727 )
								if( Long_MA <= 26.1143 )
									ret := 0.209677
								if( Long_MA > 26.1143 )
									ret := -0.923077 // sell
		if( Positive_Money_Flow > 0.623294 )
			if( Positive_Money_Flow <= 467.42 )
				if( Negative_Money_Flow <= 5900.93 )
					if( Short_MA <= 12.2961 )
						if( Money_Flow_Ratio <= 9.87587 )
							if( Money_Flow_Ratio <= 2.29203 )
								if( Positive_Money_Flow_Sum <= 147524 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 147524 )
									ret := 0.255319
							if( Money_Flow_Ratio > 2.29203 )
								ret := -0.700000 // sell
						if( Money_Flow_Ratio > 9.87587 )
							ret := 0.666667
					if( Short_MA > 12.2961 )
						if( MFI_Low <= 45.7692 )
							ret := -0.454545
						if( MFI_Low > 45.7692 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow > 5900.93 )
					if( MFI <= 23.9034 )
						ret := -0.384615
					if( MFI > 23.9034 )
						if( Long_MA <= 4.56563 )
							if( Short_MA <= 3.94863 )
								ret := -1.000000 // sell
							if( Short_MA > 3.94863 )
								ret := 0.111111
						if( Long_MA > 4.56563 )
							if( Negative_Money_Flow <= 16439.3 )
								if( Short_Long_Diff <= -0.002441 )
									ret := -0.818182 // sell
								if( Short_Long_Diff > -0.002441 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 16439.3 )
								if( Long_MA <= 18.2748 )
									ret := -1.000000 // sell
								if( Long_MA > 18.2748 )
									ret := -0.629630
			if( Positive_Money_Flow > 467.42 )
				if( Typical_Price <= 4.19149 )
					if( MFI_High <= -75.6033 )
						if( Money_Flow_Ratio <= 0.015847 )
							ret := -0.625000
						if( Money_Flow_Ratio > 0.015847 )
							ret := -1.000000 // sell
					if( MFI_High > -75.6033 )
						if( MFI <= 26.1269 )
							if( Money_Flow_Ratio <= 0.262255 )
								ret := 0.666667
							if( Money_Flow_Ratio > 0.262255 )
								ret := 1.000000 // buy
						if( MFI > 26.1269 )
							if( MFI <= 70.9259 )
								if( Positive_Money_Flow_Sum <= 3.66718e+06 )
									ret := 0.020833
								if( Positive_Money_Flow_Sum > 3.66718e+06 )
									ret := -0.568182
							if( MFI > 70.9259 )
								if( Raw_Money_Flow <= 25731.3 )
									ret := -0.123077
								if( Raw_Money_Flow > 25731.3 )
									ret := 0.300885
				if( Typical_Price > 4.19149 )
					if( Long_MA <= 5.59997 )
						if( Negative_Money_Flow_Sum <= 2.24028e+06 )
							if( Positive_Money_Flow_Sum <= 8.4236e+06 )
								if( MFI_Low <= 77.3647 )
									ret := -0.194690
								if( MFI_Low > 77.3647 )
									ret := -0.672414
							if( Positive_Money_Flow_Sum > 8.4236e+06 )
								if( MFI <= 90.9918 )
									ret := -0.400000
								if( MFI > 90.9918 )
									ret := -0.711538 // sell
						if( Negative_Money_Flow_Sum > 2.24028e+06 )
							if( MFI_High <= -26.5097 )
								if( Raw_Money_Flow <= 7335.55 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 7335.55 )
									ret := -0.782609 // sell
							if( MFI_High > -26.5097 )
								if( Typical_Price <= 5.04743 )
									ret := -0.416667
								if( Typical_Price > 5.04743 )
									ret := -0.888889 // sell
					if( Long_MA > 5.59997 )
						if( Short_Long_Diff <= 0.22281 )
							if( Positive_Money_Flow_Sum <= 204719 )
								if( Typical_Price <= 12.7256 )
									ret := -0.041841
								if( Typical_Price > 12.7256 )
									ret := -0.257237
							if( Positive_Money_Flow_Sum > 204719 )
								if( MA_Cross <= 0.521667 )
									ret := -0.034603
								if( MA_Cross > 0.521667 )
									ret := -0.252604
						if( Short_Long_Diff > 0.22281 )
							if( Raw_Money_Flow <= 2.01781e+07 )
								if( Negative_Money_Flow_Sum <= 1.28253e+06 )
									ret := -0.258862
								if( Negative_Money_Flow_Sum > 1.28253e+06 )
									ret := -0.439306
							if( Raw_Money_Flow > 2.01781e+07 )
								if( Money_Flow_Ratio <= 35.8418 )
									ret := 0.657143
								if( Money_Flow_Ratio > 35.8418 )
									ret := -0.107784
	if( Negative_Money_Flow_Sum > 2.33112e+06 )
		if( Typical_Price <= 8.53139 )
			if( Positive_Money_Flow <= 187.635 )
				if( MFI <= 71.363 )
					if( MFI_High <= -44.7905 )
						if( Short_MA <= 3.62493 )
							if( Short_Long_Diff <= 0.004994 )
								if( MFI_Low <= 2.56582 )
									ret := -0.177419
								if( MFI_Low > 2.56582 )
									ret := -0.585366
							if( Short_Long_Diff > 0.004994 )
								ret := 0.900000 // buy
						if( Short_MA > 3.62493 )
							if( MFI_High <= -73.9936 )
								if( Positive_Money_Flow_Sum <= 192286 )
									ret := 0.387900
								if( Positive_Money_Flow_Sum > 192286 )
									ret := 0.730769 // buy
							if( MFI_High > -73.9936 )
								if( Short_MA <= 3.92638 )
									ret := 0.497561
								if( Short_MA > 3.92638 )
									ret := 0.083762
					if( MFI_High > -44.7905 )
						if( Positive_Money_Flow_Sum <= 6.71506e+06 )
							if( Short_MA <= 4.13892 )
								if( Positive_Money_Flow_Sum <= 1.75637e+06 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow_Sum > 1.75637e+06 )
									ret := 0.187500
							if( Short_MA > 4.13892 )
								if( Long_MA <= 4.32184 )
									ret := 0.581081
								if( Long_MA > 4.32184 )
									ret := 0.298423
						if( Positive_Money_Flow_Sum > 6.71506e+06 )
							if( Short_Long_Diff <= 0.13225 )
								if( Money_Flow_Ratio <= 0.87497 )
									ret := 0.279693
								if( Money_Flow_Ratio > 0.87497 )
									ret := 0.033386
							if( Short_Long_Diff > 0.13225 )
								if( Positive_Money_Flow_Sum <= 8.05462e+06 )
									ret := 0.083333
								if( Positive_Money_Flow_Sum > 8.05462e+06 )
									ret := 0.730159 // buy
				if( MFI > 71.363 )
					if( Raw_Money_Flow <= 5.81256e+06 )
						if( MFI_High <= -4.51297 )
							if( Raw_Money_Flow <= 631136 )
								if( Positive_Money_Flow_Sum <= 7.61479e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 7.61479e+06 )
									ret := -0.230769
							if( Raw_Money_Flow > 631136 )
								if( Negative_Money_Flow <= 1.96819e+06 )
									ret := -0.529412
								if( Negative_Money_Flow > 1.96819e+06 )
									ret := -0.296296
						if( MFI_High > -4.51297 )
							if( Positive_Money_Flow_Sum <= 9.19244e+06 )
								ret := -0.900000 // sell
							if( Positive_Money_Flow_Sum > 9.19244e+06 )
								if( MFI_Low <= 65.5732 )
									ret := 0.359375
								if( MFI_Low > 65.5732 )
									ret := -0.500000
					if( Raw_Money_Flow > 5.81256e+06 )
						ret := -1.000000 // sell
			if( Positive_Money_Flow > 187.635 )
				if( MFI <= 40.2258 )
					if( Positive_Money_Flow <= 38141 )
						if( MFI <= 9.70039 )
							if( Negative_Money_Flow_Sum <= 6.28464e+06 )
								if( Negative_Money_Flow_Sum <= 3.68189e+06 )
									ret := 0.468750
								if( Negative_Money_Flow_Sum > 3.68189e+06 )
									ret := -0.771930 // sell
							if( Negative_Money_Flow_Sum > 6.28464e+06 )
								if( Negative_Money_Flow_Sum <= 1.03081e+07 )
									ret := 0.285714
								if( Negative_Money_Flow_Sum > 1.03081e+07 )
									ret := 0.882353 // buy
						if( MFI > 9.70039 )
							if( Positive_Money_Flow_Sum <= 572832 )
								if( Negative_Money_Flow_Sum <= 2.98424e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 2.98424e+06 )
									ret := 0.758621 // buy
							if( Positive_Money_Flow_Sum > 572832 )
								if( Positive_Money_Flow <= 1851.2 )
									ret := -0.604863
								if( Positive_Money_Flow > 1851.2 )
									ret := -0.342105
					if( Positive_Money_Flow > 38141 )
						if( Short_MA <= 3.66991 )
							if( Short_MA <= 3.09771 )
								ret := -0.222222
							if( Short_MA > 3.09771 )
								if( Short_MA <= 3.51914 )
									ret := 0.740000 // buy
								if( Short_MA > 3.51914 )
									ret := 0.375000
						if( Short_MA > 3.66991 )
							if( Negative_Money_Flow_Sum <= 1.04785e+08 )
								if( MFI_High <= -62.063 )
									ret := -0.263736
								if( MFI_High > -62.063 )
									ret := 0.021295
							if( Negative_Money_Flow_Sum > 1.04785e+08 )
								ret := 1.000000 // buy
				if( MFI > 40.2258 )
					if( Negative_Money_Flow <= 109.306 )
						if( Long_MA <= 5.55938 )
							if( Short_Long_Diff <= 0.202552 )
								if( Positive_Money_Flow_Sum <= 3.29144e+06 )
									ret := -0.135977
								if( Positive_Money_Flow_Sum > 3.29144e+06 )
									ret := 0.121387
							if( Short_Long_Diff > 0.202552 )
								if( Raw_Money_Flow <= 920749 )
									ret := -0.125000
								if( Raw_Money_Flow > 920749 )
									ret := -0.944444 // sell
						if( Long_MA > 5.55938 )
							if( Raw_Money_Flow <= 33924.2 )
								if( MFI <= 45.1336 )
									ret := 0.222222
								if( MFI > 45.1336 )
									ret := -0.489510
							if( Raw_Money_Flow > 33924.2 )
								if( MA_Cross <= 0.834866 )
									ret := 0.027484
								if( MA_Cross > 0.834866 )
									ret := -0.527778
					if( Negative_Money_Flow > 109.306 )
						if( Negative_Money_Flow_Sum <= 2.58646e+06 )
							if( MFI_Low <= 44.4867 )
								if( Long_MA <= 4.2989 )
									ret := -1.000000 // sell
								if( Long_MA > 4.2989 )
									ret := -0.272727
							if( MFI_Low > 44.4867 )
								ret := 0.230769
						if( Negative_Money_Flow_Sum > 2.58646e+06 )
							if( Positive_Money_Flow <= 226.391 )
								ret := -0.692308
							if( Positive_Money_Flow > 226.391 )
								if( Money_Flow_Ratio <= 1.0048 )
									ret := 0.208333
								if( Money_Flow_Ratio > 1.0048 )
									ret := 0.582979
		if( Typical_Price > 8.53139 )
			if( Typical_Price <= 331.966 )
				if( Positive_Money_Flow <= 1552.08 )
					if( Negative_Money_Flow <= 170630 )
						if( MFI_High <= -76.9427 )
							if( Short_MA <= 148.107 )
								if( Negative_Money_Flow_Sum <= 9.84839e+07 )
									ret := 0.414835
								if( Negative_Money_Flow_Sum > 9.84839e+07 )
									ret := -0.642857
							if( Short_MA > 148.107 )
								if( Positive_Money_Flow_Sum <= 940623 )
									ret := -0.100000
								if( Positive_Money_Flow_Sum > 940623 )
									ret := -0.615385
						if( MFI_High > -76.9427 )
							if( Negative_Money_Flow <= 1056.19 )
								if( Negative_Money_Flow_Sum <= 2.4622e+06 )
									ret := 0.562500
								if( Negative_Money_Flow_Sum > 2.4622e+06 )
									ret := 0.033236
							if( Negative_Money_Flow > 1056.19 )
								if( Short_Long_Diff <= 1.17594 )
									ret := 0.170339
								if( Short_Long_Diff > 1.17594 )
									ret := -0.174603
					if( Negative_Money_Flow > 170630 )
						if( MFI <= 13.2863 )
							if( Negative_Money_Flow_Sum <= 7.6774e+06 )
								if( Negative_Money_Flow <= 4.32657e+06 )
									ret := 0.152700
								if( Negative_Money_Flow > 4.32657e+06 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 7.6774e+06 )
								if( Short_Long_Diff <= 0.041592 )
									ret := 0.096497
								if( Short_Long_Diff > 0.041592 )
									ret := -0.141962
						if( MFI > 13.2863 )
							if( Money_Flow_Ratio <= 1.54282 )
								if( Short_MA <= 350.716 )
									ret := -0.014016
								if( Short_MA > 350.716 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 1.54282 )
								if( Money_Flow_Ratio <= 1.55667 )
									ret := 0.392523
								if( Money_Flow_Ratio > 1.55667 )
									ret := 0.046357
				if( Positive_Money_Flow > 1552.08 )
					if( Positive_Money_Flow_Sum <= 3.75919e+07 )
						if( MFI_Low <= 29.1021 )
							if( Short_Long_Diff <= 0.215223 )
								if( Positive_Money_Flow_Sum <= 2.34529e+06 )
									ret := 0.037148
								if( Positive_Money_Flow_Sum > 2.34529e+06 )
									ret := -0.041266
							if( Short_Long_Diff > 0.215223 )
								if( Short_MA <= 18.9578 )
									ret := -0.829787 // sell
								if( Short_MA > 18.9578 )
									ret := -0.306202
						if( MFI_Low > 29.1021 )
							if( Short_Long_Diff <= 0.09406 )
								if( MFI_High <= 2.17905 )
									ret := -0.055266
								if( MFI_High > 2.17905 )
									ret := 0.282051
							if( Short_Long_Diff > 0.09406 )
								if( Short_MA <= 21.8661 )
									ret := -0.142779
								if( Short_MA > 21.8661 )
									ret := -0.281918
					if( Positive_Money_Flow_Sum > 3.75919e+07 )
						if( Long_MA <= 177.48 )
							if( Negative_Money_Flow_Sum <= 1.29057e+08 )
								if( Raw_Money_Flow <= 2.04263e+08 )
									ret := 0.026135
								if( Raw_Money_Flow > 2.04263e+08 )
									ret := 0.635514
							if( Negative_Money_Flow_Sum > 1.29057e+08 )
								if( Positive_Money_Flow_Sum <= 2.66584e+09 )
									ret := 0.112020
								if( Positive_Money_Flow_Sum > 2.66584e+09 )
									ret := 0.498328
						if( Long_MA > 177.48 )
							if( Money_Flow_Ratio <= 35.5337 )
								if( Short_MA <= 179.097 )
									ret := -0.383648
								if( Short_MA > 179.097 )
									ret := -0.035794
							if( Money_Flow_Ratio > 35.5337 )
								if( MFI_High <= 15.067 )
									ret := 0.000000
								if( MFI_High > 15.067 )
									ret := -0.860000 // sell
			if( Typical_Price > 331.966 )
				if( Positive_Money_Flow_Sum <= 1.15263e+09 )
					if( Money_Flow_Ratio <= 0.928231 )
						ret := -0.650000
					if( Money_Flow_Ratio > 0.928231 )
						if( Money_Flow_Ratio <= 2.8127 )
							ret := 0.125000
						if( Money_Flow_Ratio > 2.8127 )
							ret := -0.500000
				if( Positive_Money_Flow_Sum > 1.15263e+09 )
					if( MFI <= 56.0352 )
						if( Short_MA <= 325.117 )
							ret := -0.777778 // sell
						if( Short_MA > 325.117 )
							ret := -0.947368 // sell
					if( MFI > 56.0352 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_GME_15Min_32a8cdf6(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


