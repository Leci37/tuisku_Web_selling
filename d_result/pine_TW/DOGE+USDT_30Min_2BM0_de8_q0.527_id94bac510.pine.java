//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: DOGEUSDT_30Min_2BM0_94bac510 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2BM0_94bac510", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_94bac510(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.005492 )
		if( MFI <= 54.6676 )
			if( Typical_Price <= 0.317972 )
				if( bearPower <= -0.018415 )
					if( MFI <= 39.0547 )
						if( Negative_Money_Flow_Sum <= 2.44037e+08 )
							if( Typical_Price <= 0.218555 )
								ret := 0.866667 // buy
							if( Typical_Price > 0.218555 )
								ret := -0.909091 // sell
						if( Negative_Money_Flow_Sum > 2.44037e+08 )
							if( Raw_Money_Flow <= 1.19181e+08 )
								if( bullPower <= 0.001844 )
									ret := 0.887218 // buy
								if( bullPower > 0.001844 )
									ret := 0.111111
							if( Raw_Money_Flow > 1.19181e+08 )
								if( MFI_High <= -52.3488 )
									ret := 0.865385 // buy
								if( MFI_High > -52.3488 )
									ret := 0.120000
					if( MFI > 39.0547 )
						if( Positive_Money_Flow_Sum <= 7.14582e+08 )
							if( Typical_Price <= 0.264805 )
								ret := -0.333333
							if( Typical_Price > 0.264805 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 7.14582e+08 )
							ret := -0.875000 // sell
				if( bearPower > -0.018415 )
					if( Positive_Money_Flow <= 43607.4 )
						if( Typical_Price <= 0.179653 )
							if( MFI <= 20.8468 )
								if( Negative_Money_Flow_Sum <= 6.05958e+07 )
									ret := 0.038043
								if( Negative_Money_Flow_Sum > 6.05958e+07 )
									ret := 0.362416
							if( MFI > 20.8468 )
								if( MFI_High <= -40.0638 )
									ret := 0.494652
								if( MFI_High > -40.0638 )
									ret := 0.250000
						if( Typical_Price > 0.179653 )
							if( Raw_Money_Flow <= 3.30738e+07 )
								if( Negative_Money_Flow_Sum <= 3.72839e+08 )
									ret := 0.292256
								if( Negative_Money_Flow_Sum > 3.72839e+08 )
									ret := -0.304348
							if( Raw_Money_Flow > 3.30738e+07 )
								if( bbm <= 0.015832 )
									ret := -0.123377
								if( bbm > 0.015832 )
									ret := 0.789474 // buy
					if( Positive_Money_Flow > 43607.4 )
						if( Negative_Money_Flow_Sum <= 5.78566e+08 )
							if( MFI <= 19.2994 )
								if( bearPower <= -0.011482 )
									ret := 0.600000
								if( bearPower > -0.011482 )
									ret := -0.519481
							if( MFI > 19.2994 )
								if( bearPower <= -0.003982 )
									ret := -0.062731
								if( bearPower > -0.003982 )
									ret := 0.414894
						if( Negative_Money_Flow_Sum > 5.78566e+08 )
							if( Typical_Price <= 0.237448 )
								ret := 1.000000 // buy
							if( Typical_Price > 0.237448 )
								if( Positive_Money_Flow_Sum <= 3.28012e+08 )
									ret := 0.937500 // buy
								if( Positive_Money_Flow_Sum > 3.28012e+08 )
									ret := 0.058824
			if( Typical_Price > 0.317972 )
				if( MFI <= 42.1788 )
					if( MFI <= 36.4565 )
						if( Negative_Money_Flow <= 8.48828e+07 )
							if( Positive_Money_Flow <= 1.19387e+08 )
								if( Raw_Money_Flow <= 2.74783e+07 )
									ret := -0.381356
								if( Raw_Money_Flow > 2.74783e+07 )
									ret := 0.132231
							if( Positive_Money_Flow > 1.19387e+08 )
								if( bbp <= -0.019791 )
									ret := 1.000000 // buy
								if( bbp > -0.019791 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow > 8.48828e+07 )
							if( bearPower <= -0.079461 )
								ret := 0.882353 // buy
							if( bearPower > -0.079461 )
								if( MFI <= 19.375 )
									ret := 0.272727
								if( MFI > 19.375 )
									ret := -0.586667
					if( MFI > 36.4565 )
						if( Negative_Money_Flow_Sum <= 1.10196e+09 )
							if( Negative_Money_Flow_Sum <= 2.25213e+08 )
								if( Negative_Money_Flow_Sum <= 1.77297e+08 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.77297e+08 )
									ret := -0.814815 // sell
							if( Negative_Money_Flow_Sum > 2.25213e+08 )
								if( bearPower <= -0.01386 )
									ret := 0.723810 // buy
								if( bearPower > -0.01386 )
									ret := 0.182540
						if( Negative_Money_Flow_Sum > 1.10196e+09 )
							if( Negative_Money_Flow_Sum <= 1.49865e+09 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.49865e+09 )
								ret := -0.230769
				if( MFI > 42.1788 )
					if( Money_Flow_Ratio <= 0.914607 )
						if( Negative_Money_Flow <= 2.7984e+07 )
							if( bullPower <= -0.000666 )
								if( Typical_Price <= 0.445883 )
									ret := 0.500000
								if( Typical_Price > 0.445883 )
									ret := -0.538462
							if( bullPower > -0.000666 )
								if( bbm <= 0.016515 )
									ret := -0.433333
								if( bbm > 0.016515 )
									ret := -0.916667 // sell
						if( Negative_Money_Flow > 2.7984e+07 )
							if( bearPower <= -0.021606 )
								if( bbm <= 0.019912 )
									ret := 0.166667
								if( bbm > 0.019912 )
									ret := -0.629630
							if( bearPower > -0.021606 )
								if( bearPower <= -0.013759 )
									ret := -0.916667 // sell
								if( bearPower > -0.013759 )
									ret := -0.666667
					if( Money_Flow_Ratio > 0.914607 )
						if( MFI_Low <= 30.9755 )
							if( MFI_High <= -31.0602 )
								if( Negative_Money_Flow <= 8.19141e+07 )
									ret := 0.096774
								if( Negative_Money_Flow > 8.19141e+07 )
									ret := -0.500000
							if( MFI_High > -31.0602 )
								if( Negative_Money_Flow <= 6.08178e+07 )
									ret := 0.250000
								if( Negative_Money_Flow > 6.08178e+07 )
									ret := 0.942857 // buy
						if( MFI_Low > 30.9755 )
							if( bullPower <= -0.001127 )
								ret := 0.350000
							if( bullPower > -0.001127 )
								if( Positive_Money_Flow <= 5.72164e+07 )
									ret := -0.718750 // sell
								if( Positive_Money_Flow > 5.72164e+07 )
									ret := 0.000000
		if( MFI > 54.6676 )
			if( bearPower <= -0.012186 )
				if( bullPower <= 0.008099 )
					if( MFI_High <= -18.0071 )
						if( Typical_Price <= 0.39117 )
							if( Positive_Money_Flow_Sum <= 7.37286e+08 )
								ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 7.37286e+08 )
								ret := 1.000000 // buy
						if( Typical_Price > 0.39117 )
							if( Typical_Price <= 0.415881 )
								ret := 0.600000
							if( Typical_Price > 0.415881 )
								ret := 1.000000 // buy
					if( MFI_High > -18.0071 )
						ret := 0.333333
				if( bullPower > 0.008099 )
					ret := 0.500000
			if( bearPower > -0.012186 )
				if( Positive_Money_Flow_Sum <= 3.99774e+08 )
					if( Negative_Money_Flow_Sum <= 8.17225e+07 )
						if( MFI <= 56.9551 )
							ret := 0.692308
						if( MFI > 56.9551 )
							if( bbp <= -0.006961 )
								ret := 0.181818
							if( bbp > -0.006961 )
								ret := -0.050000
					if( Negative_Money_Flow_Sum > 8.17225e+07 )
						if( Raw_Money_Flow <= 1.70885e+07 )
							if( Money_Flow_Ratio <= 1.47733 )
								if( bearPower <= -0.005451 )
									ret := 1.000000 // buy
								if( bearPower > -0.005451 )
									ret := 0.952381 // buy
							if( Money_Flow_Ratio > 1.47733 )
								ret := 0.736842 // buy
						if( Raw_Money_Flow > 1.70885e+07 )
							if( bullPower <= -0.00091 )
								ret := -0.083333
							if( bullPower > -0.00091 )
								if( Negative_Money_Flow <= 2.5744e+07 )
									ret := 0.600000
								if( Negative_Money_Flow > 2.5744e+07 )
									ret := 0.827586 // buy
				if( Positive_Money_Flow_Sum > 3.99774e+08 )
					if( bearPower <= -0.008544 )
						if( bbp <= -0.010598 )
							ret := -0.538462
						if( bbp > -0.010598 )
							if( Positive_Money_Flow_Sum <= 1.20894e+09 )
								if( Raw_Money_Flow <= 5.07021e+07 )
									ret := 0.636364
								if( Raw_Money_Flow > 5.07021e+07 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.20894e+09 )
								ret := -0.076923
					if( bearPower > -0.008544 )
						ret := -0.684211
	if( bbp > -0.005492 )
		if( MFI <= 79.3129 )
			if( Raw_Money_Flow <= 2.21221e+07 )
				if( Raw_Money_Flow <= 83664.6 )
					if( Negative_Money_Flow_Sum <= 375662 )
						if( bearPower <= -3.5e-05 )
							if( bbp <= -5.3e-05 )
								if( Negative_Money_Flow_Sum <= 196878 )
									ret := 0.615385
								if( Negative_Money_Flow_Sum > 196878 )
									ret := -0.016129
							if( bbp > -5.3e-05 )
								if( bbp <= -3.6e-05 )
									ret := 0.536585
								if( bbp > -3.6e-05 )
									ret := 0.923077 // buy
						if( bearPower > -3.5e-05 )
							if( BBPower_Color <= 0.5 )
								if( Raw_Money_Flow <= 53539.2 )
									ret := 0.053957
								if( Raw_Money_Flow > 53539.2 )
									ret := -0.244444
							if( BBPower_Color > 0.5 )
								if( Negative_Money_Flow_Sum <= 282274 )
									ret := -0.006820
								if( Negative_Money_Flow_Sum > 282274 )
									ret := -0.268398
					if( Negative_Money_Flow_Sum > 375662 )
						if( bbm <= 5.8e-05 )
							if( Negative_Money_Flow_Sum <= 464179 )
								if( Money_Flow_Ratio <= 0.90695 )
									ret := 0.325893
								if( Money_Flow_Ratio > 0.90695 )
									ret := 0.751773 // buy
							if( Negative_Money_Flow_Sum > 464179 )
								if( MFI_Low <= 1.077 )
									ret := -0.360000
								if( MFI_Low > 1.077 )
									ret := 0.241960
						if( bbm > 5.8e-05 )
							if( bearPower <= -0.000102 )
								if( bbm <= 9e-05 )
									ret := 0.700000 // buy
								if( bbm > 9e-05 )
									ret := 0.076923
							if( bearPower > -0.000102 )
								if( Positive_Money_Flow_Sum <= 676659 )
									ret := -0.189474
								if( Positive_Money_Flow_Sum > 676659 )
									ret := 0.162162
				if( Raw_Money_Flow > 83664.6 )
					if( bearPower <= -0.002232 )
						if( Money_Flow_Ratio <= 0.470447 )
							if( bearPower <= -0.004116 )
								if( Raw_Money_Flow <= 1.22016e+07 )
									ret := 0.674419
								if( Raw_Money_Flow > 1.22016e+07 )
									ret := -0.047619
							if( bearPower > -0.004116 )
								if( MFI_Low <= 8.98499 )
									ret := 0.046310
								if( MFI_Low > 8.98499 )
									ret := -0.281867
						if( Money_Flow_Ratio > 0.470447 )
							if( bullPower <= 0.002227 )
								if( MFI_Low <= 48.0968 )
									ret := 0.152136
								if( MFI_Low > 48.0968 )
									ret := -0.311111
							if( bullPower > 0.002227 )
								if( MFI <= 60.1323 )
									ret := -0.273764
								if( MFI > 60.1323 )
									ret := 0.317073
					if( bearPower > -0.002232 )
						if( Positive_Money_Flow_Sum <= 3.39564e+08 )
							if( bullPower <= 0.00273 )
								if( Positive_Money_Flow_Sum <= 1.50582e+08 )
									ret := -0.007384
								if( Positive_Money_Flow_Sum > 1.50582e+08 )
									ret := 0.224299
							if( bullPower > 0.00273 )
								if( MFI_High <= -30.8136 )
									ret := -0.337478
								if( MFI_High > -30.8136 )
									ret := -0.060032
						if( Positive_Money_Flow_Sum > 3.39564e+08 )
							if( Negative_Money_Flow_Sum <= 2.73676e+08 )
								if( MFI_Low <= 54.0459 )
									ret := 0.633333
								if( MFI_Low > 54.0459 )
									ret := 0.086957
							if( Negative_Money_Flow_Sum > 2.73676e+08 )
								if( Negative_Money_Flow <= 2.26604e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.26604e+06 )
									ret := 0.250000
			if( Raw_Money_Flow > 2.21221e+07 )
				if( Positive_Money_Flow_Sum <= 3.11175e+08 )
					if( bearPower <= -0.007484 )
						if( bullPower <= 0.005609 )
							if( Negative_Money_Flow <= 2.70841e+07 )
								ret := 0.571429
							if( Negative_Money_Flow > 2.70841e+07 )
								ret := -0.125000
						if( bullPower > 0.005609 )
							ret := 1.000000 // buy
					if( bearPower > -0.007484 )
						if( Positive_Money_Flow_Sum <= 3.04017e+08 )
							if( Money_Flow_Ratio <= 3.83988 )
								if( Typical_Price <= 0.24671 )
									ret := -0.100860
								if( Typical_Price > 0.24671 )
									ret := -0.372984
							if( Money_Flow_Ratio > 3.83988 )
								ret := 0.833333 // buy
						if( Positive_Money_Flow_Sum > 3.04017e+08 )
							if( MFI_High <= -22.0434 )
								ret := -0.352941
							if( MFI_High > -22.0434 )
								if( MFI_Low <= 51.807 )
									ret := -1.000000 // sell
								if( MFI_Low > 51.807 )
									ret := -0.454545
				if( Positive_Money_Flow_Sum > 3.11175e+08 )
					if( bullPower <= 0.010011 )
						if( Money_Flow_Ratio <= 3.4006 )
							if( bbm <= 0.006375 )
								if( Positive_Money_Flow <= 1.54721e+06 )
									ret := -0.021053
								if( Positive_Money_Flow > 1.54721e+06 )
									ret := -0.365696
							if( bbm > 0.006375 )
								if( bearPower <= -0.003945 )
									ret := 0.021583
								if( bearPower > -0.003945 )
									ret := 0.343602
						if( Money_Flow_Ratio > 3.4006 )
							if( Positive_Money_Flow_Sum <= 4.47909e+08 )
								if( bullPower <= 0.008061 )
									ret := 1.000000 // buy
								if( bullPower > 0.008061 )
									ret := 0.888889 // buy
							if( Positive_Money_Flow_Sum > 4.47909e+08 )
								ret := 0.363636
					if( bullPower > 0.010011 )
						if( Raw_Money_Flow <= 9.25754e+07 )
							if( Positive_Money_Flow_Sum <= 7.29952e+08 )
								if( Positive_Money_Flow <= 3.38012e+07 )
									ret := 0.116129
								if( Positive_Money_Flow > 3.38012e+07 )
									ret := -0.387833
							if( Positive_Money_Flow_Sum > 7.29952e+08 )
								if( Typical_Price <= 0.618678 )
									ret := -0.751515 // sell
								if( Typical_Price > 0.618678 )
									ret := 0.076923
						if( Raw_Money_Flow > 9.25754e+07 )
							if( Negative_Money_Flow_Sum <= 1.49615e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.49615e+08 )
								if( Negative_Money_Flow_Sum <= 1.09155e+09 )
									ret := -0.153173
								if( Negative_Money_Flow_Sum > 1.09155e+09 )
									ret := 0.185328
		if( MFI > 79.3129 )
			if( Negative_Money_Flow <= 50758.3 )
				if( Negative_Money_Flow_Sum <= 8.3479e+07 )
					if( bbp <= 0.004453 )
						if( Positive_Money_Flow <= 6.26864e+06 )
							if( Raw_Money_Flow <= 2.52425e+06 )
								if( Negative_Money_Flow_Sum <= 165635 )
									ret := -0.319767
								if( Negative_Money_Flow_Sum > 165635 )
									ret := 0.006091
							if( Raw_Money_Flow > 2.52425e+06 )
								if( bullPower <= 0.003113 )
									ret := -0.287091
								if( bullPower > 0.003113 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow > 6.26864e+06 )
							if( Positive_Money_Flow_Sum <= 4.40894e+07 )
								if( bbp <= 0.003318 )
									ret := 0.113208
								if( bbp > 0.003318 )
									ret := -0.403226
							if( Positive_Money_Flow_Sum > 4.40894e+07 )
								if( Positive_Money_Flow_Sum <= 5.1026e+07 )
									ret := 0.853659 // buy
								if( Positive_Money_Flow_Sum > 5.1026e+07 )
									ret := 0.386792
					if( bbp > 0.004453 )
						if( Typical_Price <= 0.272044 )
							if( Raw_Money_Flow <= 5.5947e+07 )
								if( Negative_Money_Flow_Sum <= 4.93438e+07 )
									ret := -0.337000
								if( Negative_Money_Flow_Sum > 4.93438e+07 )
									ret := 0.444444
							if( Raw_Money_Flow > 5.5947e+07 )
								if( Positive_Money_Flow_Sum <= 4.23864e+08 )
									ret := -0.638889
								if( Positive_Money_Flow_Sum > 4.23864e+08 )
									ret := -1.000000 // sell
						if( Typical_Price > 0.272044 )
							if( MFI <= 87.3002 )
								if( bearPower <= 0.004446 )
									ret := -1.000000 // sell
								if( bearPower > 0.004446 )
									ret := -0.920000 // sell
							if( MFI > 87.3002 )
								ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 8.3479e+07 )
					if( MFI_Low <= 63.496 )
						if( Raw_Money_Flow <= 6.35115e+07 )
							if( Typical_Price <= 0.254543 )
								ret := 1.000000 // buy
							if( Typical_Price > 0.254543 )
								if( bullPower <= 0.010895 )
									ret := 0.400000
								if( bullPower > 0.010895 )
									ret := 0.555556
						if( Raw_Money_Flow > 6.35115e+07 )
							if( bearPower <= 0.011206 )
								if( Raw_Money_Flow <= 1.35502e+08 )
									ret := -0.431373
								if( Raw_Money_Flow > 1.35502e+08 )
									ret := 0.611111
							if( bearPower > 0.011206 )
								if( bullPower <= 0.062673 )
									ret := 0.574468
								if( bullPower > 0.062673 )
									ret := -0.750000 // sell
					if( MFI_Low > 63.496 )
						if( bullPower <= 0.051316 )
							if( MFI_High <= 5.56458 )
								if( bullPower <= 0.017918 )
									ret := 0.666667
								if( bullPower > 0.017918 )
									ret := -0.529412
							if( MFI_High > 5.56458 )
								if( Negative_Money_Flow_Sum <= 1.09214e+08 )
									ret := 0.300000
								if( Negative_Money_Flow_Sum > 1.09214e+08 )
									ret := 1.000000 // buy
						if( bullPower > 0.051316 )
							if( Negative_Money_Flow_Sum <= 5.01502e+08 )
								ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 5.01502e+08 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow > 50758.3 )
				if( MFI_Low <= 59.4494 )
					if( Negative_Money_Flow <= 2.1819e+06 )
						ret := -0.312500
					if( Negative_Money_Flow > 2.1819e+06 )
						ret := -0.857143 // sell
				if( MFI_Low > 59.4494 )
					if( bullPower <= 0.011843 )
						if( Raw_Money_Flow <= 2.32611e+07 )
							if( Negative_Money_Flow_Sum <= 1.34203e+06 )
								if( Negative_Money_Flow_Sum <= 1.15759e+06 )
									ret := 0.163265
								if( Negative_Money_Flow_Sum > 1.15759e+06 )
									ret := 0.925926 // buy
							if( Negative_Money_Flow_Sum > 1.34203e+06 )
								if( bbp <= 0.009676 )
									ret := 0.070376
								if( bbp > 0.009676 )
									ret := -0.421053
						if( Raw_Money_Flow > 2.32611e+07 )
							if( bbm <= 0.005438 )
								if( Negative_Money_Flow <= 3.21524e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 3.21524e+07 )
									ret := 0.666667
							if( bbm > 0.005438 )
								ret := 0.473684
					if( bullPower > 0.011843 )
						if( bbm <= 0.017705 )
							if( bbm <= 0.007418 )
								ret := -0.538462
							if( bbm > 0.007418 )
								if( bbm <= 0.011753 )
									ret := -1.000000 // sell
								if( bbm > 0.011753 )
									ret := -0.916667 // sell
						if( bbm > 0.017705 )
							ret := 0.052632
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_DOGEUSDT_30Min_94bac510(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


