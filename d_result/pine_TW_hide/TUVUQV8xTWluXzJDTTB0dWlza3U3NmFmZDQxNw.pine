//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: META_1Min_2CM0_76afd417 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_2CM0_76afd417", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_76afd417(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 291.301 )
		if( Raw_Money_Flow <= 2.37628e+07 )
			if( MFI_High <= -61.437 )
				if( Negative_Money_Flow_Sum <= 9.11943e+06 )
					if( MFI_High <= -63.2285 )
						if( ad_mf <= 0.08706 )
							if( MFI_High <= -65.8329 )
								if( mf <= -0.009514 )
									ret := 0.125000
								if( mf > -0.009514 )
									ret := -0.300000
							if( MFI_High > -65.8329 )
								ret := 0.047619
						if( ad_mf > 0.08706 )
							if( mf <= -0.591591 )
								ret := -0.285714
							if( mf > -0.591591 )
								if( Negative_Money_Flow_Sum <= 7.3439e+06 )
									ret := 0.136364
								if( Negative_Money_Flow_Sum > 7.3439e+06 )
									ret := 0.754717 // buy
					if( MFI_High > -63.2285 )
						if( Raw_Money_Flow <= 145752 )
							if( MFI <= 17.6926 )
								ret := 0.076923
							if( MFI > 17.6926 )
								ret := -0.578947
						if( Raw_Money_Flow > 145752 )
							if( Negative_Money_Flow_Sum <= 5.05186e+06 )
								if( ad_mf <= 128.266 )
									ret := 0.363636
								if( ad_mf > 128.266 )
									ret := -0.727273 // sell
							if( Negative_Money_Flow_Sum > 5.05186e+06 )
								if( Positive_Money_Flow_Sum <= 1.35225e+06 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 1.35225e+06 )
									ret := -0.100000
				if( Negative_Money_Flow_Sum > 9.11943e+06 )
					if( Positive_Money_Flow <= 1.34739e+07 )
						if( Negative_Money_Flow_Sum <= 3.32302e+07 )
							if( ad <= -988.227 )
								if( Raw_Money_Flow <= 710146 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 710146 )
									ret := -0.272727
							if( ad > -988.227 )
								if( ad_mf <= 0.028277 )
									ret := -0.013514
								if( ad_mf > 0.028277 )
									ret := -0.404624
						if( Negative_Money_Flow_Sum > 3.32302e+07 )
							if( Positive_Money_Flow <= 1.18737e+07 )
								if( ad_mf <= -675.5 )
									ret := 0.127660
								if( ad_mf > -675.5 )
									ret := -0.128664
							if( Positive_Money_Flow > 1.18737e+07 )
								if( Negative_Money_Flow_Sum <= 1.79637e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.79637e+08 )
									ret := -0.200000
					if( Positive_Money_Flow > 1.34739e+07 )
						if( Typical_Price <= 492.422 )
							if( Positive_Money_Flow_Sum <= 3.0442e+07 )
								ret := 0.055556
							if( Positive_Money_Flow_Sum > 3.0442e+07 )
								if( Typical_Price <= 452.004 )
									ret := 1.000000 // buy
								if( Typical_Price > 452.004 )
									ret := 0.444444
						if( Typical_Price > 492.422 )
							if( Negative_Money_Flow_Sum <= 1.60721e+08 )
								if( Money_Flow_Ratio <= 0.185917 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.185917 )
									ret := 0.473684
							if( Negative_Money_Flow_Sum > 1.60721e+08 )
								if( Negative_Money_Flow_Sum <= 2.58472e+08 )
									ret := -0.717391 // sell
								if( Negative_Money_Flow_Sum > 2.58472e+08 )
									ret := 0.028571
			if( MFI_High > -61.437 )
				if( ad <= 3.74178 )
					if( MFI_High <= -57.9714 )
						if( Positive_Money_Flow <= 154704 )
							if( mf <= -0.090188 )
								if( Negative_Money_Flow_Sum <= 5.13111e+06 )
									ret := -0.593750
								if( Negative_Money_Flow_Sum > 5.13111e+06 )
									ret := 0.263158
							if( mf > -0.090188 )
								if( MFI_High <= -59.5926 )
									ret := -0.166667
								if( MFI_High > -59.5926 )
									ret := 0.307692
						if( Positive_Money_Flow > 154704 )
							if( Positive_Money_Flow_Sum <= 2.041e+07 )
								if( mf <= -0.534751 )
									ret := -0.083333
								if( mf > -0.534751 )
									ret := 0.656489
							if( Positive_Money_Flow_Sum > 2.041e+07 )
								if( Typical_Price <= 495.021 )
									ret := 0.571429
								if( Typical_Price > 495.021 )
									ret := -0.207547
					if( MFI_High > -57.9714 )
						if( Positive_Money_Flow_Sum <= 2.7869e+06 )
							if( Money_Flow_Ratio <= 2.04513 )
								if( Positive_Money_Flow_Sum <= 1.13384e+06 )
									ret := -0.080063
								if( Positive_Money_Flow_Sum > 1.13384e+06 )
									ret := 0.131202
							if( Money_Flow_Ratio > 2.04513 )
								if( Money_Flow_Ratio <= 3.86194 )
									ret := -0.126866
								if( Money_Flow_Ratio > 3.86194 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 2.7869e+06 )
							if( Raw_Money_Flow <= 153885 )
								if( Negative_Money_Flow_Sum <= 5.12581e+06 )
									ret := -0.182948
								if( Negative_Money_Flow_Sum > 5.12581e+06 )
									ret := 0.084848
							if( Raw_Money_Flow > 153885 )
								if( Positive_Money_Flow_Sum <= 1.02799e+08 )
									ret := -0.005972
								if( Positive_Money_Flow_Sum > 1.02799e+08 )
									ret := 0.088211
				if( ad > 3.74178 )
					if( MFI <= 88.4243 )
						if( mf <= 0.122594 )
							if( Positive_Money_Flow_Sum <= 4.36278e+08 )
								if( MFI <= 48.5236 )
									ret := -0.011382
								if( MFI > 48.5236 )
									ret := -0.071421
							if( Positive_Money_Flow_Sum > 4.36278e+08 )
								if( ad <= 13146.1 )
									ret := -0.121212
								if( ad > 13146.1 )
									ret := -1.000000 // sell
						if( mf > 0.122594 )
							if( Typical_Price <= 472.526 )
								if( MFI <= 80.9958 )
									ret := 0.197452
								if( MFI > 80.9958 )
									ret := -0.209302
							if( Typical_Price > 472.526 )
								if( MFI <= 46.5398 )
									ret := -0.084567
								if( MFI > 46.5398 )
									ret := 0.031799
					if( MFI > 88.4243 )
						if( Positive_Money_Flow_Sum <= 2.27334e+08 )
							if( Money_Flow_Ratio <= 75.7438 )
								if( ad <= 15818.8 )
									ret := -0.204819
								if( ad > 15818.8 )
									ret := -0.530303
							if( Money_Flow_Ratio > 75.7438 )
								if( mf <= 0.448965 )
									ret := -1.000000 // sell
								if( mf > 0.448965 )
									ret := -0.818182 // sell
						if( Positive_Money_Flow_Sum > 2.27334e+08 )
							if( mf <= 0.379377 )
								if( Positive_Money_Flow_Sum <= 3.86213e+08 )
									ret := 0.823529 // buy
								if( Positive_Money_Flow_Sum > 3.86213e+08 )
									ret := 0.176471
							if( mf > 0.379377 )
								if( ad <= 2580.94 )
									ret := -0.357143
								if( ad > 2580.94 )
									ret := -0.125000
		if( Raw_Money_Flow > 2.37628e+07 )
			if( MFI_Low <= 76.4289 )
				if( Negative_Money_Flow_Sum <= 7.36614e+06 )
					if( MFI_Low <= 75.6676 )
						if( Positive_Money_Flow_Sum <= 3.35866e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.35866e+07 )
							if( Positive_Money_Flow_Sum <= 1.01326e+08 )
								if( Negative_Money_Flow_Sum <= 4.85469e+06 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow_Sum > 4.85469e+06 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.01326e+08 )
								if( Negative_Money_Flow_Sum <= 6.85008e+06 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 6.85008e+06 )
									ret := -1.000000 // sell
					if( MFI_Low > 75.6676 )
						ret := 0.363636
				if( Negative_Money_Flow_Sum > 7.36614e+06 )
					if( Typical_Price <= 433.44 )
						if( MFI <= 49.8593 )
							if( ad <= 67900.8 )
								if( MFI <= 27.8828 )
									ret := 0.363636
								if( MFI > 27.8828 )
									ret := 0.960526 // buy
							if( ad > 67900.8 )
								if( Typical_Price <= 430.065 )
									ret := 1.000000 // buy
								if( Typical_Price > 430.065 )
									ret := -0.500000
						if( MFI > 49.8593 )
							if( MFI <= 57.0926 )
								ret := -1.000000 // sell
							if( MFI > 57.0926 )
								if( ad_mf <= 38692.6 )
									ret := 0.041667
								if( ad_mf > 38692.6 )
									ret := 0.666667
					if( Typical_Price > 433.44 )
						if( MFI <= 51.0367 )
							if( Positive_Money_Flow_Sum <= 2.75993e+08 )
								if( Positive_Money_Flow_Sum <= 6.87597e+07 )
									ret := 0.164384
								if( Positive_Money_Flow_Sum > 6.87597e+07 )
									ret := -0.143295
							if( Positive_Money_Flow_Sum > 2.75993e+08 )
								if( Positive_Money_Flow_Sum <= 8.81588e+08 )
									ret := -0.623832
								if( Positive_Money_Flow_Sum > 8.81588e+08 )
									ret := 0.555556
						if( MFI > 51.0367 )
							if( ad <= 74775.1 )
								if( MFI_Low <= 40.8863 )
									ret := 0.087937
								if( MFI_Low > 40.8863 )
									ret := -0.169648
							if( ad > 74775.1 )
								if( Positive_Money_Flow_Sum <= 1.41383e+09 )
									ret := 0.023897
								if( Positive_Money_Flow_Sum > 1.41383e+09 )
									ret := 0.506329
			if( MFI_Low > 76.4289 )
				if( ad <= 60510 )
					if( mf <= 0.294331 )
						if( Positive_Money_Flow <= 3.80088e+07 )
							ret := 0.909091 // buy
						if( Positive_Money_Flow > 3.80088e+07 )
							if( mf <= -0.08077 )
								ret := 1.000000 // buy
							if( mf > -0.08077 )
								if( ad_mf <= 17877.2 )
									ret := -0.214286
								if( ad_mf > 17877.2 )
									ret := -1.000000 // sell
					if( mf > 0.294331 )
						if( Raw_Money_Flow <= 7.22233e+07 )
							if( ad_mf <= 7299.3 )
								if( ad_mf <= -5079.42 )
									ret := 1.000000 // buy
								if( ad_mf > -5079.42 )
									ret := 0.900000 // buy
							if( ad_mf > 7299.3 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 7.22233e+07 )
							ret := -0.538462
				if( ad > 60510 )
					if( Positive_Money_Flow <= 8.6512e+07 )
						if( Negative_Money_Flow_Sum <= 5.4716e+06 )
							if( Positive_Money_Flow_Sum <= 2.28481e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.28481e+08 )
								ret := -0.454545
						if( Negative_Money_Flow_Sum > 5.4716e+06 )
							ret := 0.230769
					if( Positive_Money_Flow > 8.6512e+07 )
						if( mf <= 0.631488 )
							if( Negative_Money_Flow_Sum <= 4.21303e+06 )
								ret := 0.937500 // buy
							if( Negative_Money_Flow_Sum > 4.21303e+06 )
								ret := 0.300000
						if( mf > 0.631488 )
							ret := -0.166667
	if( Negative_Money_Flow > 291.301 )
		if( Negative_Money_Flow_Sum <= 1.53381e+09 )
			if( Negative_Money_Flow_Sum <= 5.51143e+07 )
				if( Positive_Money_Flow_Sum <= 3.15724e+06 )
					if( Raw_Money_Flow <= 1.57408e+06 )
						if( MFI <= 59.9667 )
							if( ad_mf <= 0.235647 )
								if( MFI_Low <= 4.80182 )
									ret := 0.025907
								if( MFI_Low > 4.80182 )
									ret := 0.170626
							if( ad_mf > 0.235647 )
								if( Money_Flow_Ratio <= 0.160484 )
									ret := -0.281081
								if( Money_Flow_Ratio > 0.160484 )
									ret := -0.014179
						if( MFI > 59.9667 )
							if( mf <= -0.108368 )
								if( Typical_Price <= 478.14 )
									ret := 0.233333
								if( Typical_Price > 478.14 )
									ret := -0.493590
							if( mf > -0.108368 )
								if( Positive_Money_Flow_Sum <= 2.97748e+06 )
									ret := -0.085014
								if( Positive_Money_Flow_Sum > 2.97748e+06 )
									ret := 0.460526
					if( Raw_Money_Flow > 1.57408e+06 )
						if( ad_mf <= 574.111 )
							if( Positive_Money_Flow_Sum <= 2.98468e+06 )
								if( MFI_Low <= -16.0168 )
									ret := 0.076923
								if( MFI_Low > -16.0168 )
									ret := 0.649123
							if( Positive_Money_Flow_Sum > 2.98468e+06 )
								ret := -0.100000
						if( ad_mf > 574.111 )
							if( MFI_High <= -57.0548 )
								if( ad_mf <= 3879.64 )
									ret := -0.600000
								if( ad_mf > 3879.64 )
									ret := 0.355556
							if( MFI_High > -57.0548 )
								if( Negative_Money_Flow_Sum <= 6.66122e+06 )
									ret := 0.300000
								if( Negative_Money_Flow_Sum > 6.66122e+06 )
									ret := 0.933333 // buy
				if( Positive_Money_Flow_Sum > 3.15724e+06 )
					if( mf <= -0.085376 )
						if( Negative_Money_Flow_Sum <= 4.73394e+07 )
							if( MFI <= 12.4852 )
								if( mf <= -0.457839 )
									ret := -0.333333
								if( mf > -0.457839 )
									ret := 0.750000 // buy
							if( MFI > 12.4852 )
								if( Raw_Money_Flow <= 167337 )
									ret := 0.308989
								if( Raw_Money_Flow > 167337 )
									ret := -0.131738
						if( Negative_Money_Flow_Sum > 4.73394e+07 )
							if( Raw_Money_Flow <= 5.88224e+06 )
								if( Negative_Money_Flow <= 1.96247e+06 )
									ret := -0.210526
								if( Negative_Money_Flow > 1.96247e+06 )
									ret := 0.425101
							if( Raw_Money_Flow > 5.88224e+06 )
								if( Positive_Money_Flow_Sum <= 1.50756e+07 )
									ret := -0.560000
								if( Positive_Money_Flow_Sum > 1.50756e+07 )
									ret := 0.082237
					if( mf > -0.085376 )
						if( ad_mf <= -0.312549 )
							if( Raw_Money_Flow <= 326578 )
								if( ad <= -100.87 )
									ret := 0.471616
								if( ad > -100.87 )
									ret := 0.113757
							if( Raw_Money_Flow > 326578 )
								if( Positive_Money_Flow_Sum <= 5.53061e+06 )
									ret := -0.111111
								if( Positive_Money_Flow_Sum > 5.53061e+06 )
									ret := 0.099794
						if( ad_mf > -0.312549 )
							if( MFI_High <= -33.0735 )
								if( ad <= 18904.5 )
									ret := -0.129562
								if( ad > 18904.5 )
									ret := 0.666667
							if( MFI_High > -33.0735 )
								if( Negative_Money_Flow_Sum <= 1.15721e+06 )
									ret := -0.425000
								if( Negative_Money_Flow_Sum > 1.15721e+06 )
									ret := 0.045392
			if( Negative_Money_Flow_Sum > 5.51143e+07 )
				if( ad_mf <= -8540.02 )
					if( Negative_Money_Flow <= 6.29295e+06 )
						if( ad <= -9767.47 )
							if( Positive_Money_Flow_Sum <= 4.15237e+07 )
								if( Positive_Money_Flow_Sum <= 3.33527e+07 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 3.33527e+07 )
									ret := -0.645161
							if( Positive_Money_Flow_Sum > 4.15237e+07 )
								if( mf <= 0.055427 )
									ret := 0.470199
								if( mf > 0.055427 )
									ret := -0.014925
						if( ad > -9767.47 )
							if( Negative_Money_Flow_Sum <= 5.82976e+07 )
								if( ad_mf <= -9470.73 )
									ret := 0.375000
								if( ad_mf > -9470.73 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 5.82976e+07 )
								if( Negative_Money_Flow_Sum <= 9.04039e+07 )
									ret := 0.676190
								if( Negative_Money_Flow_Sum > 9.04039e+07 )
									ret := 0.307692
					if( Negative_Money_Flow > 6.29295e+06 )
						if( mf <= -0.442592 )
							if( Typical_Price <= 519.746 )
								if( MFI_High <= -78.3597 )
									ret := -0.818182 // sell
								if( MFI_High > -78.3597 )
									ret := 0.584034
							if( Typical_Price > 519.746 )
								if( ad_mf <= -28688.9 )
									ret := -0.459016
								if( ad_mf > -28688.9 )
									ret := 0.333333
						if( mf > -0.442592 )
							if( MFI_High <= -22.2897 )
								if( Money_Flow_Ratio <= 1.24601 )
									ret := 0.023444
								if( Money_Flow_Ratio > 1.24601 )
									ret := 0.297352
							if( MFI_High > -22.2897 )
								if( ad_mf <= -25146.7 )
									ret := -0.147917
								if( ad_mf > -25146.7 )
									ret := -0.001985
				if( ad_mf > -8540.02 )
					if( Money_Flow_Ratio <= 1.53311 )
						if( Positive_Money_Flow_Sum <= 3.42862e+08 )
							if( Negative_Money_Flow_Sum <= 8.27691e+07 )
								if( Negative_Money_Flow <= 1.61597e+07 )
									ret := -0.149058
								if( Negative_Money_Flow > 1.61597e+07 )
									ret := 0.180233
							if( Negative_Money_Flow_Sum > 8.27691e+07 )
								if( Negative_Money_Flow_Sum <= 9.40918e+07 )
									ret := 0.113852
								if( Negative_Money_Flow_Sum > 9.40918e+07 )
									ret := -0.040518
						if( Positive_Money_Flow_Sum > 3.42862e+08 )
							if( Positive_Money_Flow <= 122516 )
								if( Negative_Money_Flow <= 4.4055e+07 )
									ret := 0.622222
								if( Negative_Money_Flow > 4.4055e+07 )
									ret := 0.215686
							if( Positive_Money_Flow > 122516 )
								if( ad <= -3438.44 )
									ret := 0.294118
								if( ad > -3438.44 )
									ret := -0.261538
					if( Money_Flow_Ratio > 1.53311 )
						if( Raw_Money_Flow <= 8.94129e+07 )
							if( MFI_High <= -19.2231 )
								if( Positive_Money_Flow_Sum <= 1.04496e+08 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow_Sum > 1.04496e+08 )
									ret := 0.880000 // buy
							if( MFI_High > -19.2231 )
								if( MFI_High <= -18.3887 )
									ret := -0.161290
								if( MFI_High > -18.3887 )
									ret := 0.082723
						if( Raw_Money_Flow > 8.94129e+07 )
							if( Money_Flow_Ratio <= 2.43232 )
								ret := 0.111111
							if( Money_Flow_Ratio > 2.43232 )
								if( Positive_Money_Flow_Sum <= 1.72047e+09 )
									ret := -0.769231 // sell
								if( Positive_Money_Flow_Sum > 1.72047e+09 )
									ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 1.53381e+09 )
			if( Negative_Money_Flow <= 1.29829e+07 )
				ret := 0.600000
			if( Negative_Money_Flow > 1.29829e+07 )
				ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_META_1Min_76afd417(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


