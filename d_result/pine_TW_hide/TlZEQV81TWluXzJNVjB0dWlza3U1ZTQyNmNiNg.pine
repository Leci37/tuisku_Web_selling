//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: NVDA_5Min_2MV0_5e426cb6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_2MV0_5e426cb6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_5e426cb6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 1.01864 )
		if( VIM <= 1.14842 )
			if( Typical_Price <= 104.975 )
				if( Positive_Money_Flow_Sum <= 2.97243e+09 )
					if( VIP_VIM <= -0.173124 )
						if( VIM <= 1.14083 )
							if( Typical_Price <= 103.728 )
								if( MFI_High <= -36.7084 )
									ret := 0.200000
								if( MFI_High > -36.7084 )
									ret := 0.857143 // buy
							if( Typical_Price > 103.728 )
								if( Raw_Money_Flow <= 2.48863e+08 )
									ret := 0.636364
								if( Raw_Money_Flow > 2.48863e+08 )
									ret := 1.000000 // buy
						if( VIM > 1.14083 )
							ret := -0.400000
					if( VIP_VIM > -0.173124 )
						if( MFI <= 55.0513 )
							if( Negative_Money_Flow_Sum <= 7.75382e+07 )
								ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 7.75382e+07 )
								if( VIP <= 0.918123 )
									ret := 0.608696
								if( VIP > 0.918123 )
									ret := -0.263736
						if( MFI > 55.0513 )
							if( MFI <= 70.1769 )
								if( Money_Flow_Ratio <= 1.41378 )
									ret := 0.125000
								if( Money_Flow_Ratio > 1.41378 )
									ret := 0.659574
							if( MFI > 70.1769 )
								ret := -0.357143
				if( Positive_Money_Flow_Sum > 2.97243e+09 )
					if( MFI_Low <= 35.8392 )
						if( Positive_Money_Flow_Sum <= 4.61913e+09 )
							if( MFI <= 42.5036 )
								ret := 1.000000 // buy
							if( MFI > 42.5036 )
								if( VIM <= 1.01538 )
									ret := 0.538462
								if( VIM > 1.01538 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 4.61913e+09 )
							ret := -0.090909
					if( MFI_Low > 35.8392 )
						if( MFI_Low <= 39.6202 )
							ret := 1.000000 // buy
						if( MFI_Low > 39.6202 )
							ret := 0.812500 // buy
			if( Typical_Price > 104.975 )
				if( Raw_Money_Flow <= 5.98348e+07 )
					if( Positive_Money_Flow_Sum <= 3.20667e+09 )
						if( Typical_Price <= 105.278 )
							if( VIP <= 0.953329 )
								ret := 0.111111
							if( VIP > 0.953329 )
								if( MFI <= 55.9569 )
									ret := -0.428571
								if( MFI > 55.9569 )
									ret := -1.000000 // sell
						if( Typical_Price > 105.278 )
							if( MFI_Low <= 6.93971 )
								if( Typical_Price <= 106.758 )
									ret := 0.695652
								if( Typical_Price > 106.758 )
									ret := -0.152188
							if( MFI_Low > 6.93971 )
								if( Negative_Money_Flow_Sum <= 1.73543e+07 )
									ret := 0.253106
								if( Negative_Money_Flow_Sum > 1.73543e+07 )
									ret := 0.006641
					if( Positive_Money_Flow_Sum > 3.20667e+09 )
						if( Typical_Price <= 338.937 )
							if( Negative_Money_Flow_Sum <= 2.89663e+09 )
								if( MFI_High <= -10.6168 )
									ret := -0.384615
								if( MFI_High > -10.6168 )
									ret := 0.095238
							if( Negative_Money_Flow_Sum > 2.89663e+09 )
								ret := 0.307692
						if( Typical_Price > 338.937 )
							if( Money_Flow_Ratio <= 1.88602 )
								if( Positive_Money_Flow_Sum <= 4.07981e+09 )
									ret := -0.921875 // sell
								if( Positive_Money_Flow_Sum > 4.07981e+09 )
									ret := -0.529412
							if( Money_Flow_Ratio > 1.88602 )
								ret := -0.090909
				if( Raw_Money_Flow > 5.98348e+07 )
					if( Negative_Money_Flow <= 1.28253e+09 )
						if( Negative_Money_Flow_Sum <= 2.46081e+08 )
							if( Negative_Money_Flow <= 7.82803e+07 )
								if( VIP_VIM <= 0.209336 )
									ret := -0.111111
								if( VIP_VIM > 0.209336 )
									ret := 0.438095
							if( Negative_Money_Flow > 7.82803e+07 )
								if( VIP <= 0.913072 )
									ret := 0.723810 // buy
								if( VIP > 0.913072 )
									ret := -0.138889
						if( Negative_Money_Flow_Sum > 2.46081e+08 )
							if( Positive_Money_Flow_Sum <= 2.34874e+09 )
								if( MFI_Low <= -12.4462 )
									ret := -0.395349
								if( MFI_Low > -12.4462 )
									ret := -0.061706
							if( Positive_Money_Flow_Sum > 2.34874e+09 )
								if( MFI_Low <= 21.7815 )
									ret := -0.014481
								if( MFI_Low > 21.7815 )
									ret := -0.228944
					if( Negative_Money_Flow > 1.28253e+09 )
						if( VIP_VIM <= -0.312264 )
							if( Typical_Price <= 908.765 )
								if( Negative_Money_Flow <= 1.5211e+09 )
									ret := 0.930233 // buy
								if( Negative_Money_Flow > 1.5211e+09 )
									ret := 0.584906
							if( Typical_Price > 908.765 )
								ret := -0.500000
						if( VIP_VIM > -0.312264 )
							if( MFI_Low <= 6.36442 )
								if( Raw_Money_Flow <= 1.76162e+09 )
									ret := -0.425000
								if( Raw_Money_Flow > 1.76162e+09 )
									ret := 0.086957
							if( MFI_Low > 6.36442 )
								if( Raw_Money_Flow <= 1.94731e+09 )
									ret := 0.677419
								if( Raw_Money_Flow > 1.94731e+09 )
									ret := 0.088235
		if( VIM > 1.14842 )
			if( Typical_Price <= 1075.78 )
				if( Positive_Money_Flow <= 5.7605e+08 )
					if( Positive_Money_Flow <= 4.55537e+08 )
						if( Typical_Price <= 210.965 )
							if( MFI <= 37.3768 )
								if( MFI_High <= -44.3503 )
									ret := 0.146925
								if( MFI_High > -44.3503 )
									ret := 0.400000
							if( MFI > 37.3768 )
								if( Raw_Money_Flow <= 3.61253e+08 )
									ret := 0.007968
								if( Raw_Money_Flow > 3.61253e+08 )
									ret := -0.500000
						if( Typical_Price > 210.965 )
							if( MFI_Low <= -2.22945 )
								if( Negative_Money_Flow_Sum <= 2.78846e+08 )
									ret := 0.197029
								if( Negative_Money_Flow_Sum > 2.78846e+08 )
									ret := 0.001108
							if( MFI_Low > -2.22945 )
								if( VIP <= 0.637121 )
									ret := -0.337563
								if( VIP > 0.637121 )
									ret := -0.008696
					if( Positive_Money_Flow > 4.55537e+08 )
						if( Typical_Price <= 125.054 )
							if( Positive_Money_Flow_Sum <= 2.94373e+09 )
								if( Positive_Money_Flow <= 5.1458e+08 )
									ret := 0.100000
								if( Positive_Money_Flow > 5.1458e+08 )
									ret := -0.482759
							if( Positive_Money_Flow_Sum > 2.94373e+09 )
								ret := -0.727273 // sell
						if( Typical_Price > 125.054 )
							if( VIP <= 0.654021 )
								if( Raw_Money_Flow <= 5.32783e+08 )
									ret := -0.517241
								if( Raw_Money_Flow > 5.32783e+08 )
									ret := 0.625000
							if( VIP > 0.654021 )
								if( Negative_Money_Flow_Sum <= 8.43758e+09 )
									ret := 0.629771
								if( Negative_Money_Flow_Sum > 8.43758e+09 )
									ret := -0.523810
				if( Positive_Money_Flow > 5.7605e+08 )
					if( VIM <= 1.26724 )
						if( Positive_Money_Flow_Sum <= 1.447e+09 )
							if( Typical_Price <= 528.459 )
								if( VIP <= 0.738095 )
									ret := 1.000000 // buy
								if( VIP > 0.738095 )
									ret := 0.555556
							if( Typical_Price > 528.459 )
								ret := 0.111111
						if( Positive_Money_Flow_Sum > 1.447e+09 )
							if( Money_Flow_Ratio <= 0.361103 )
								if( VIM <= 1.22169 )
									ret := -0.376344
								if( VIM > 1.22169 )
									ret := -0.868421 // sell
							if( Money_Flow_Ratio > 0.361103 )
								if( MFI <= 45.6214 )
									ret := 0.184783
								if( MFI > 45.6214 )
									ret := -0.759259 // sell
					if( VIM > 1.26724 )
						if( Positive_Money_Flow <= 8.27224e+08 )
							if( MFI <= 16.8778 )
								ret := -0.133333
							if( MFI > 16.8778 )
								if( MFI_Low <= 10.0476 )
									ret := -0.870130 // sell
								if( MFI_Low > 10.0476 )
									ret := -0.200000
						if( Positive_Money_Flow > 8.27224e+08 )
							if( MFI <= 20.3025 )
								ret := -0.833333 // sell
							if( MFI > 20.3025 )
								if( Raw_Money_Flow <= 9.03959e+08 )
									ret := 0.500000
								if( Raw_Money_Flow > 9.03959e+08 )
									ret := -0.235294
			if( Typical_Price > 1075.78 )
				if( VIP_VIM <= -0.258148 )
					if( MFI_Low <= 16.5679 )
						if( Raw_Money_Flow <= 7.14285e+08 )
							if( Typical_Price <= 1126.61 )
								if( Raw_Money_Flow <= 1.18704e+07 )
									ret := 0.454545
								if( Raw_Money_Flow > 1.18704e+07 )
									ret := 0.921875 // buy
							if( Typical_Price > 1126.61 )
								if( VIM <= 1.43473 )
									ret := 0.350649
								if( VIM > 1.43473 )
									ret := -0.210526
						if( Raw_Money_Flow > 7.14285e+08 )
							if( Typical_Price <= 1111.51 )
								ret := -0.409091
							if( Typical_Price > 1111.51 )
								ret := 0.687500
					if( MFI_Low > 16.5679 )
						if( Negative_Money_Flow_Sum <= 1.31763e+10 )
							if( Typical_Price <= 1156.94 )
								if( Positive_Money_Flow_Sum <= 9.08106e+07 )
									ret := 0.120000
								if( Positive_Money_Flow_Sum > 9.08106e+07 )
									ret := -0.441176
							if( Typical_Price > 1156.94 )
								if( Money_Flow_Ratio <= 0.686914 )
									ret := 0.733333 // buy
								if( Money_Flow_Ratio > 0.686914 )
									ret := 0.120000
						if( Negative_Money_Flow_Sum > 1.31763e+10 )
							ret := 0.875000 // buy
				if( VIP_VIM > -0.258148 )
					ret := -0.769231 // sell
	if( VIP > 1.01864 )
		if( Negative_Money_Flow_Sum <= 3.9313e+09 )
			if( MFI_Low <= 11.8869 )
				if( Negative_Money_Flow <= 488961 )
					if( Typical_Price <= 127.645 )
						if( VIM <= 1.26348 )
							if( Raw_Money_Flow <= 2.92608e+07 )
								if( Negative_Money_Flow_Sum <= 1.20951e+08 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 1.20951e+08 )
									ret := 0.067797
							if( Raw_Money_Flow > 2.92608e+07 )
								if( MFI_Low <= 5.71543 )
									ret := -1.000000 // sell
								if( MFI_Low > 5.71543 )
									ret := -0.454545
						if( VIM > 1.26348 )
							ret := -0.954545 // sell
					if( Typical_Price > 127.645 )
						if( MFI <= 23.2961 )
							if( MFI_High <= -61.6122 )
								if( VIP <= 1.44248 )
									ret := 0.000000
								if( VIP > 1.44248 )
									ret := 0.240000
							if( MFI_High > -61.6122 )
								if( Negative_Money_Flow_Sum <= 6.5265e+06 )
									ret := -0.136364
								if( Negative_Money_Flow_Sum > 6.5265e+06 )
									ret := 0.327381
						if( MFI > 23.2961 )
							if( Negative_Money_Flow_Sum <= 1.90425e+07 )
								if( MFI <= 30.2628 )
									ret := 0.203297
								if( MFI > 30.2628 )
									ret := -0.121951
							if( Negative_Money_Flow_Sum > 1.90425e+07 )
								if( VIM <= 1.2371 )
									ret := 0.089947
								if( VIM > 1.2371 )
									ret := -0.547368
				if( Negative_Money_Flow > 488961 )
					if( Positive_Money_Flow_Sum <= 6.15951e+07 )
						if( Negative_Money_Flow_Sum <= 6.73836e+06 )
							if( MFI_High <= -51.9965 )
								if( Raw_Money_Flow <= 844340 )
									ret := -0.416667
								if( Raw_Money_Flow > 844340 )
									ret := -0.857143 // sell
							if( MFI_High > -51.9965 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 6.73836e+06 )
							if( Raw_Money_Flow <= 4.52611e+06 )
								if( VIP <= 1.87519 )
									ret := 0.015837
								if( VIP > 1.87519 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 4.52611e+06 )
								if( Positive_Money_Flow_Sum <= 1.66284e+07 )
									ret := -0.485075
								if( Positive_Money_Flow_Sum > 1.66284e+07 )
									ret := -0.030612
					if( Positive_Money_Flow_Sum > 6.15951e+07 )
						if( Negative_Money_Flow_Sum <= 3.57425e+08 )
							if( MFI_Low <= 9.11637 )
								if( VIP <= 1.06884 )
									ret := 0.181818
								if( VIP > 1.06884 )
									ret := 0.826087 // buy
							if( MFI_Low > 9.11637 )
								if( Negative_Money_Flow <= 2.0051e+07 )
									ret := -0.068966
								if( Negative_Money_Flow > 2.0051e+07 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 3.57425e+08 )
							if( MFI_High <= -49.4332 )
								if( MFI_Low <= 9.99003 )
									ret := -0.064327
								if( MFI_Low > 9.99003 )
									ret := -0.666667
							if( MFI_High > -49.4332 )
								ret := 0.312500
			if( MFI_Low > 11.8869 )
				if( Negative_Money_Flow <= 9.01278e+08 )
					if( Negative_Money_Flow <= 5.40688e+08 )
						if( Negative_Money_Flow <= 1.58795e+08 )
							if( Raw_Money_Flow <= 1.77375e+08 )
								if( VIM <= 1.2474 )
									ret := 0.064038
								if( VIM > 1.2474 )
									ret := -0.040653
							if( Raw_Money_Flow > 1.77375e+08 )
								if( Positive_Money_Flow_Sum <= 2.76004e+09 )
									ret := -0.091985
								if( Positive_Money_Flow_Sum > 2.76004e+09 )
									ret := 0.028606
						if( Negative_Money_Flow > 1.58795e+08 )
							if( MFI_Low <= 42.9435 )
								if( MFI_Low <= 42.7562 )
									ret := 0.049702
								if( MFI_Low > 42.7562 )
									ret := 0.578125
							if( MFI_Low > 42.9435 )
								if( Money_Flow_Ratio <= 1.77233 )
									ret := -0.445887
								if( Money_Flow_Ratio > 1.77233 )
									ret := -0.119161
					if( Negative_Money_Flow > 5.40688e+08 )
						if( Positive_Money_Flow_Sum <= 8.132e+09 )
							if( VIM <= 0.77425 )
								if( Money_Flow_Ratio <= 6.18081 )
									ret := 0.606383
								if( Money_Flow_Ratio > 6.18081 )
									ret := 0.071429
							if( VIM > 0.77425 )
								if( VIM <= 0.841706 )
									ret := -0.145540
								if( VIM > 0.841706 )
									ret := 0.425000
						if( Positive_Money_Flow_Sum > 8.132e+09 )
							if( VIM <= 0.721041 )
								if( VIP <= 1.26416 )
									ret := 0.750000 // buy
								if( VIP > 1.26416 )
									ret := 1.000000 // buy
							if( VIM > 0.721041 )
								if( MFI <= 72.0697 )
									ret := -0.942857 // sell
								if( MFI > 72.0697 )
									ret := -0.354167
				if( Negative_Money_Flow > 9.01278e+08 )
					if( MFI <= 48.3586 )
						ret := 0.333333
					if( MFI > 48.3586 )
						if( VIP_VIM <= 0.655049 )
							if( MFI <= 69.6157 )
								if( MFI_Low <= 42.6454 )
									ret := -0.803571 // sell
								if( MFI_Low > 42.6454 )
									ret := 0.105263
							if( MFI > 69.6157 )
								if( Negative_Money_Flow_Sum <= 1.63466e+09 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 1.63466e+09 )
									ret := -0.952941 // sell
						if( VIP_VIM > 0.655049 )
							ret := 0.545455
		if( Negative_Money_Flow_Sum > 3.9313e+09 )
			if( Money_Flow_Ratio <= 0.65659 )
				if( VIP <= 1.02638 )
					ret := 0.071429
				if( VIP > 1.02638 )
					if( VIP_VIM <= 0.030328 )
						ret := -0.833333 // sell
					if( VIP_VIM > 0.030328 )
						if( Positive_Money_Flow_Sum <= 3.24043e+09 )
							if( VIM <= 0.954671 )
								if( Raw_Money_Flow <= 2.22846e+08 )
									ret := -0.304348
								if( Raw_Money_Flow > 2.22846e+08 )
									ret := -0.692308
							if( VIM > 0.954671 )
								if( Negative_Money_Flow_Sum <= 4.91883e+09 )
									ret := 0.043478
								if( Negative_Money_Flow_Sum > 4.91883e+09 )
									ret := -0.181818
						if( Positive_Money_Flow_Sum > 3.24043e+09 )
							ret := -0.727273 // sell
			if( Money_Flow_Ratio > 0.65659 )
				if( Negative_Money_Flow_Sum <= 8.61251e+09 )
					if( Negative_Money_Flow_Sum <= 6.22343e+09 )
						if( Positive_Money_Flow_Sum <= 9.04558e+09 )
							if( Negative_Money_Flow <= 6.52203e+08 )
								if( Negative_Money_Flow_Sum <= 5.91155e+09 )
									ret := 0.230373
								if( Negative_Money_Flow_Sum > 5.91155e+09 )
									ret := 0.916667 // buy
							if( Negative_Money_Flow > 6.52203e+08 )
								if( MFI_High <= -18.2165 )
									ret := 0.717172 // buy
								if( MFI_High > -18.2165 )
									ret := 0.058824
						if( Positive_Money_Flow_Sum > 9.04558e+09 )
							if( VIP_VIM <= 0.285722 )
								if( Positive_Money_Flow_Sum <= 1.62177e+10 )
									ret := -0.852941 // sell
								if( Positive_Money_Flow_Sum > 1.62177e+10 )
									ret := -0.181818
							if( VIP_VIM > 0.285722 )
								if( Money_Flow_Ratio <= 2.97937 )
									ret := 0.265306
								if( Money_Flow_Ratio > 2.97937 )
									ret := -0.680000
					if( Negative_Money_Flow_Sum > 6.22343e+09 )
						if( Typical_Price <= 701.864 )
							ret := 0.333333
						if( Typical_Price > 701.864 )
							if( MFI_Low <= 38.4967 )
								if( MFI_Low <= 27.3156 )
									ret := 0.772727 // buy
								if( MFI_Low > 27.3156 )
									ret := 0.964912 // buy
							if( MFI_Low > 38.4967 )
								ret := 0.466667
				if( Negative_Money_Flow_Sum > 8.61251e+09 )
					if( VIP <= 1.09935 )
						ret := -0.100000
					if( VIP > 1.09935 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_NVDA_5Min_5e426cb6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


