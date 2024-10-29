//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: LYFT_1Min_2MV0_25a0195a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2MV0_25a0195a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_25a0195a(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Money_Flow_Ratio <= 4.82889 )
		if( VIM <= 3.09096 )
			if( Typical_Price <= 12.5845 )
				if( Positive_Money_Flow_Sum <= 4.79619e+06 )
					if( VIP_VIM <= -0.763121 )
						if( Raw_Money_Flow <= 1.11253e+06 )
							if( Typical_Price <= 12.4874 )
								if( Positive_Money_Flow_Sum <= 96989.4 )
									ret := 0.457983
								if( Positive_Money_Flow_Sum > 96989.4 )
									ret := 0.213270
							if( Typical_Price > 12.4874 )
								if( Positive_Money_Flow_Sum <= 489721 )
									ret := -0.416667
								if( Positive_Money_Flow_Sum > 489721 )
									ret := 0.200000
						if( Raw_Money_Flow > 1.11253e+06 )
							if( Negative_Money_Flow_Sum <= 5.06838e+06 )
								ret := 0.090909
							if( Negative_Money_Flow_Sum > 5.06838e+06 )
								if( Typical_Price <= 11.4595 )
									ret := 1.000000 // buy
								if( Typical_Price > 11.4595 )
									ret := 0.545455
					if( VIP_VIM > -0.763121 )
						if( Negative_Money_Flow_Sum <= 1.61317e+06 )
							if( Money_Flow_Ratio <= 4.47849 )
								if( Raw_Money_Flow <= 255064 )
									ret := -0.010013
								if( Raw_Money_Flow > 255064 )
									ret := 0.092413
							if( Money_Flow_Ratio > 4.47849 )
								if( MFI_Low <= 62.6885 )
									ret := -0.387283
								if( MFI_Low > 62.6885 )
									ret := 0.240000
						if( Negative_Money_Flow_Sum > 1.61317e+06 )
							if( VIP <= 1.07703 )
								if( Negative_Money_Flow <= 1.33739e+06 )
									ret := 0.079949
								if( Negative_Money_Flow > 1.33739e+06 )
									ret := 0.376471
							if( VIP > 1.07703 )
								if( MFI_High <= -7.83643 )
									ret := -0.049089
								if( MFI_High > -7.83643 )
									ret := 0.600000
				if( Positive_Money_Flow_Sum > 4.79619e+06 )
					if( Positive_Money_Flow_Sum <= 4.99763e+06 )
						if( Raw_Money_Flow <= 617677 )
							if( MFI <= 64.4459 )
								if( Raw_Money_Flow <= 215225 )
									ret := -0.461538
								if( Raw_Money_Flow > 215225 )
									ret := 0.620690
							if( MFI > 64.4459 )
								if( Negative_Money_Flow_Sum <= 1.61565e+06 )
									ret := 0.681818
								if( Negative_Money_Flow_Sum > 1.61565e+06 )
									ret := 0.923077 // buy
						if( Raw_Money_Flow > 617677 )
							if( MFI <= 48.2948 )
								ret := 1.000000 // buy
							if( MFI > 48.2948 )
								if( Typical_Price <= 12.3892 )
									ret := -0.146667
								if( Typical_Price > 12.3892 )
									ret := 0.894737 // buy
					if( Positive_Money_Flow_Sum > 4.99763e+06 )
						if( Typical_Price <= 11.4112 )
							if( Positive_Money_Flow <= 2.48612e+06 )
								if( Typical_Price <= 9.13862 )
									ret := 0.905660 // buy
								if( Typical_Price > 9.13862 )
									ret := 0.337612
							if( Positive_Money_Flow > 2.48612e+06 )
								if( Negative_Money_Flow_Sum <= 3.31947e+07 )
									ret := -0.541176
								if( Negative_Money_Flow_Sum > 3.31947e+07 )
									ret := 0.111111
						if( Typical_Price > 11.4112 )
							if( VIP <= 1.38164 )
								if( VIP_VIM <= 0.419512 )
									ret := 0.035294
								if( VIP_VIM > 0.419512 )
									ret := -0.173780
							if( VIP > 1.38164 )
								if( VIP_VIM <= -0.038462 )
									ret := 0.375000
								if( VIP_VIM > -0.038462 )
									ret := -0.536585
			if( Typical_Price > 12.5845 )
				if( Positive_Money_Flow <= 417.034 )
					if( Negative_Money_Flow_Sum <= 717214 )
						if( Money_Flow_Ratio <= 0.449151 )
							if( Negative_Money_Flow <= 211147 )
								if( Negative_Money_Flow_Sum <= 613659 )
									ret := 0.216667
								if( Negative_Money_Flow_Sum > 613659 )
									ret := 0.729167 // buy
							if( Negative_Money_Flow > 211147 )
								if( MFI_High <= -59.6728 )
									ret := 0.555556
								if( MFI_High > -59.6728 )
									ret := 0.937500 // buy
						if( Money_Flow_Ratio > 0.449151 )
							if( MFI_Low <= 60.6733 )
								if( Raw_Money_Flow <= 22274.6 )
									ret := 0.219069
								if( Raw_Money_Flow > 22274.6 )
									ret := -0.018416
							if( MFI_Low > 60.6733 )
								if( VIP <= 1.19393 )
									ret := 0.000000
								if( VIP > 1.19393 )
									ret := 0.609195
					if( Negative_Money_Flow_Sum > 717214 )
						if( Money_Flow_Ratio <= 2.76571 )
							if( Negative_Money_Flow_Sum <= 1.81319e+06 )
								if( MFI_Low <= -6.8856 )
									ret := 0.625000
								if( MFI_Low > -6.8856 )
									ret := 0.043797
							if( Negative_Money_Flow_Sum > 1.81319e+06 )
								if( VIP <= 0.559325 )
									ret := 0.328571
								if( VIP > 0.559325 )
									ret := -0.041271
						if( Money_Flow_Ratio > 2.76571 )
							if( Raw_Money_Flow <= 776942 )
								if( VIM <= 0.751769 )
									ret := 0.180328
								if( VIM > 0.751769 )
									ret := -0.235401
							if( Raw_Money_Flow > 776942 )
								if( VIP_VIM <= 0.431472 )
									ret := -0.851064 // sell
								if( VIP_VIM > 0.431472 )
									ret := -0.560000
				if( Positive_Money_Flow > 417.034 )
					if( Positive_Money_Flow <= 29002 )
						if( Negative_Money_Flow_Sum <= 374363 )
							if( Positive_Money_Flow <= 16753.1 )
								if( Negative_Money_Flow_Sum <= 253074 )
									ret := -0.220443
								if( Negative_Money_Flow_Sum > 253074 )
									ret := -0.584475
							if( Positive_Money_Flow > 16753.1 )
								if( Positive_Money_Flow <= 17094.3 )
									ret := -0.937500 // sell
								if( Positive_Money_Flow > 17094.3 )
									ret := -0.620370
						if( Negative_Money_Flow_Sum > 374363 )
							if( Negative_Money_Flow_Sum <= 1.98308e+06 )
								if( Typical_Price <= 17.6051 )
									ret := 0.012857
								if( Typical_Price > 17.6051 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.98308e+06 )
								if( VIP <= 0.836494 )
									ret := 0.360000
								if( VIP > 0.836494 )
									ret := -0.366391
					if( Positive_Money_Flow > 29002 )
						if( MFI <= 13.671 )
							if( Positive_Money_Flow_Sum <= 1.5742e+06 )
								if( MFI_Low <= -11.1358 )
									ret := 0.617021
								if( MFI_Low > -11.1358 )
									ret := 0.061350
							if( Positive_Money_Flow_Sum > 1.5742e+06 )
								if( VIP <= 0.796724 )
									ret := 0.842105 // buy
								if( VIP > 0.796724 )
									ret := 0.285714
						if( MFI > 13.671 )
							if( Negative_Money_Flow <= 5.50562 )
								if( VIM <= 1.87415 )
									ret := -0.066899
								if( VIM > 1.87415 )
									ret := -0.382979
							if( Negative_Money_Flow > 5.50562 )
								if( VIP_VIM <= -0.336995 )
									ret := -0.387755
								if( VIP_VIM > -0.336995 )
									ret := 0.182510
		if( VIM > 3.09096 )
			if( Negative_Money_Flow <= 14.2631 )
				if( MFI <= 52.86 )
					if( VIM <= 91.8312 )
						if( Positive_Money_Flow_Sum <= 24680 )
							if( VIM <= 6.32241 )
								if( Positive_Money_Flow <= 6306.41 )
									ret := -0.131783
								if( Positive_Money_Flow > 6306.41 )
									ret := 0.578947
							if( VIM > 6.32241 )
								if( VIP_VIM <= -1.13623 )
									ret := 0.073171
								if( VIP_VIM > -1.13623 )
									ret := -0.664122
						if( Positive_Money_Flow_Sum > 24680 )
							if( Positive_Money_Flow <= 9.43187 )
								if( MFI_Low <= 15.098 )
									ret := 0.330097
								if( MFI_Low > 15.098 )
									ret := 0.076433
							if( Positive_Money_Flow > 9.43187 )
								if( MFI_Low <= 21.3421 )
									ret := -0.190476
								if( MFI_Low > 21.3421 )
									ret := 0.031936
					if( VIM > 91.8312 )
						if( Raw_Money_Flow <= 3485.04 )
							if( Positive_Money_Flow <= 1198.5 )
								ret := -0.285714
							if( Positive_Money_Flow > 1198.5 )
								ret := 0.000000
						if( Raw_Money_Flow > 3485.04 )
							if( Positive_Money_Flow_Sum <= 32704.4 )
								if( Positive_Money_Flow_Sum <= 25894.4 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 25894.4 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 32704.4 )
								if( Positive_Money_Flow <= 7392.26 )
									ret := -0.083333
								if( Positive_Money_Flow > 7392.26 )
									ret := -0.687500
				if( MFI > 52.86 )
					if( VIP <= 6.60023 )
						if( VIM <= 3.6985 )
							if( Positive_Money_Flow_Sum <= 155132 )
								if( Typical_Price <= 13.5826 )
									ret := -0.152672
								if( Typical_Price > 13.5826 )
									ret := 0.196970
							if( Positive_Money_Flow_Sum > 155132 )
								if( VIM <= 3.40538 )
									ret := -0.625000
								if( VIM > 3.40538 )
									ret := -0.137931
						if( VIM > 3.6985 )
							if( Negative_Money_Flow_Sum <= 35844 )
								if( MFI <= 69.1152 )
									ret := 0.071429
								if( MFI > 69.1152 )
									ret := -0.333333
							if( Negative_Money_Flow_Sum > 35844 )
								if( Positive_Money_Flow <= 103.579 )
									ret := 0.000000
								if( Positive_Money_Flow > 103.579 )
									ret := -0.531680
					if( VIP > 6.60023 )
						if( Positive_Money_Flow_Sum <= 247502 )
							if( Negative_Money_Flow_Sum <= 80809 )
								if( Positive_Money_Flow_Sum <= 110979 )
									ret := -0.098701
								if( Positive_Money_Flow_Sum > 110979 )
									ret := -0.410000
							if( Negative_Money_Flow_Sum > 80809 )
								if( Positive_Money_Flow <= 62508 )
									ret := 0.090909
								if( Positive_Money_Flow > 62508 )
									ret := 0.846154 // buy
						if( Positive_Money_Flow_Sum > 247502 )
							if( MFI_High <= 0.319893 )
								if( MFI <= 79.4703 )
									ret := -0.769231 // sell
								if( MFI > 79.4703 )
									ret := -1.000000 // sell
							if( MFI_High > 0.319893 )
								ret := 0.214286
			if( Negative_Money_Flow > 14.2631 )
				if( Money_Flow_Ratio <= 0.017227 )
					if( Raw_Money_Flow <= 6556.6 )
						ret := -0.777778 // sell
					if( Raw_Money_Flow > 6556.6 )
						if( Negative_Money_Flow_Sum <= 1.38823e+07 )
							ret := -0.666667
						if( Negative_Money_Flow_Sum > 1.38823e+07 )
							ret := -0.222222
				if( Money_Flow_Ratio > 0.017227 )
					if( MFI <= 15.62 )
						if( Positive_Money_Flow_Sum <= 387021 )
							if( Typical_Price <= 10.8275 )
								ret := -0.111111
							if( Typical_Price > 10.8275 )
								if( MFI_Low <= -8.98282 )
									ret := 0.429091
								if( MFI_Low > -8.98282 )
									ret := 0.624224
						if( Positive_Money_Flow_Sum > 387021 )
							ret := -0.812500 // sell
					if( MFI > 15.62 )
						if( Raw_Money_Flow <= 1702.75 )
							if( Money_Flow_Ratio <= 0.479221 )
								if( Negative_Money_Flow <= 1191.01 )
									ret := -0.757576 // sell
								if( Negative_Money_Flow > 1191.01 )
									ret := 0.360000
							if( Money_Flow_Ratio > 0.479221 )
								if( Negative_Money_Flow_Sum <= 33392.2 )
									ret := 0.425926
								if( Negative_Money_Flow_Sum > 33392.2 )
									ret := -0.067227
						if( Raw_Money_Flow > 1702.75 )
							if( Money_Flow_Ratio <= 0.398945 )
								if( Raw_Money_Flow <= 4377.51 )
									ret := -0.122699
								if( Raw_Money_Flow > 4377.51 )
									ret := 0.325234
							if( Money_Flow_Ratio > 0.398945 )
								if( VIP <= 8.02159 )
									ret := 0.352817
								if( VIP > 8.02159 )
									ret := 0.542005
	if( Money_Flow_Ratio > 4.82889 )
		if( MFI_Low <= 76.4766 )
			if( VIP <= 4.30477 )
				if( VIM <= 0.975062 )
					if( VIP_VIM <= 0.79798 )
						if( VIP_VIM <= 0.664602 )
							if( Negative_Money_Flow_Sum <= 497716 )
								if( Positive_Money_Flow_Sum <= 2.61909e+06 )
									ret := -0.027273
								if( Positive_Money_Flow_Sum > 2.61909e+06 )
									ret := -0.320755
							if( Negative_Money_Flow_Sum > 497716 )
								if( Positive_Money_Flow <= 4337.82 )
									ret := -0.166667
								if( Positive_Money_Flow > 4337.82 )
									ret := -0.441618
						if( VIP_VIM > 0.664602 )
							if( Positive_Money_Flow_Sum <= 5.62494e+06 )
								if( Positive_Money_Flow_Sum <= 5.12416e+06 )
									ret := -0.224638
								if( Positive_Money_Flow_Sum > 5.12416e+06 )
									ret := -0.838710 // sell
							if( Positive_Money_Flow_Sum > 5.62494e+06 )
								if( Negative_Money_Flow_Sum <= 1.59173e+06 )
									ret := 0.335079
								if( Negative_Money_Flow_Sum > 1.59173e+06 )
									ret := -0.428571
					if( VIP_VIM > 0.79798 )
						if( Positive_Money_Flow_Sum <= 3.55621e+06 )
							if( VIP <= 1.92948 )
								if( Negative_Money_Flow_Sum <= 244541 )
									ret := -0.428571
								if( Negative_Money_Flow_Sum > 244541 )
									ret := 0.060000
							if( VIP > 1.92948 )
								ret := 0.136364
						if( Positive_Money_Flow_Sum > 3.55621e+06 )
							if( Positive_Money_Flow <= 2.04871e+06 )
								if( Negative_Money_Flow_Sum <= 1.02827e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 1.02827e+06 )
									ret := -0.528090
							if( Positive_Money_Flow > 2.04871e+06 )
								ret := 0.500000
				if( VIM > 0.975062 )
					if( VIP_VIM <= 0.195994 )
						if( Money_Flow_Ratio <= 8.07511 )
							if( MFI <= 85.6649 )
								if( Positive_Money_Flow_Sum <= 144016 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 144016 )
									ret := -0.201923
							if( MFI > 85.6649 )
								if( Positive_Money_Flow_Sum <= 1.06476e+06 )
									ret := 0.339286
								if( Positive_Money_Flow_Sum > 1.06476e+06 )
									ret := -0.388889
						if( Money_Flow_Ratio > 8.07511 )
							if( Money_Flow_Ratio <= 12.6459 )
								if( Positive_Money_Flow <= 1105.55 )
									ret := -0.117647
								if( Positive_Money_Flow > 1105.55 )
									ret := -0.861386 // sell
							if( Money_Flow_Ratio > 12.6459 )
								if( Typical_Price <= 14.1268 )
									ret := -0.350649
								if( Typical_Price > 14.1268 )
									ret := 0.190476
					if( VIP_VIM > 0.195994 )
						if( VIP <= 1.87564 )
							if( Negative_Money_Flow_Sum <= 72211.9 )
								if( Positive_Money_Flow_Sum <= 256213 )
									ret := 0.818182 // buy
								if( Positive_Money_Flow_Sum > 256213 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 72211.9 )
								if( Negative_Money_Flow_Sum <= 416811 )
									ret := 0.472868
								if( Negative_Money_Flow_Sum > 416811 )
									ret := -0.071429
						if( VIP > 1.87564 )
							if( Positive_Money_Flow_Sum <= 155655 )
								if( VIP <= 3.90691 )
									ret := 0.505747
								if( VIP > 3.90691 )
									ret := -0.166667
							if( Positive_Money_Flow_Sum > 155655 )
								if( Negative_Money_Flow <= 3799.09 )
									ret := -0.334129
								if( Negative_Money_Flow > 3799.09 )
									ret := 0.301887
			if( VIP > 4.30477 )
				if( VIM <= 383.147 )
					if( Negative_Money_Flow_Sum <= 262976 )
						if( MFI <= 94.4196 )
							if( VIM <= 3.54209 )
								if( MFI <= 89.5955 )
									ret := -0.058824
								if( MFI > 89.5955 )
									ret := -0.777778 // sell
							if( VIM > 3.54209 )
								if( VIP_VIM <= -0.601293 )
									ret := -0.461538
								if( VIP_VIM > -0.601293 )
									ret := 0.279693
						if( MFI > 94.4196 )
							ret := 0.900000 // buy
					if( Negative_Money_Flow_Sum > 262976 )
						ret := -1.000000 // sell
				if( VIM > 383.147 )
					if( VIP_VIM <= 1.45028 )
						ret := -0.642857
					if( VIP_VIM > 1.45028 )
						ret := -1.000000 // sell
		if( MFI_Low > 76.4766 )
			if( VIP_VIM <= 0.719057 )
				if( VIP <= 1.32461 )
					if( VIM <= 0.676631 )
						ret := 1.000000 // buy
					if( VIM > 0.676631 )
						if( MFI <= 98.9202 )
							ret := 0.352941
						if( MFI > 98.9202 )
							ret := 0.736842 // buy
				if( VIP > 1.32461 )
					if( Typical_Price <= 11.7024 )
						if( Negative_Money_Flow_Sum <= 107459 )
							if( Money_Flow_Ratio <= 124.435 )
								ret := 0.625000
							if( Money_Flow_Ratio > 124.435 )
								ret := -0.090909
						if( Negative_Money_Flow_Sum > 107459 )
							if( Money_Flow_Ratio <= 72.2237 )
								ret := -0.444444
							if( Money_Flow_Ratio > 72.2237 )
								ret := -0.928571 // sell
					if( Typical_Price > 11.7024 )
						if( VIP_VIM <= 0.236739 )
							if( MFI <= 97.7365 )
								if( MFI_High <= 17.5681 )
									ret := 0.666667
								if( MFI_High > 17.5681 )
									ret := 1.000000 // buy
							if( MFI > 97.7365 )
								if( Money_Flow_Ratio <= 118.072 )
									ret := 0.105263
								if( Money_Flow_Ratio > 118.072 )
									ret := 0.833333 // buy
						if( VIP_VIM > 0.236739 )
							if( Raw_Money_Flow <= 617456 )
								if( Typical_Price <= 13.3951 )
									ret := 0.794118 // buy
								if( Typical_Price > 13.3951 )
									ret := 0.121951
							if( Raw_Money_Flow > 617456 )
								if( Typical_Price <= 13.5109 )
									ret := 0.100000
								if( Typical_Price > 13.5109 )
									ret := -0.928571 // sell
			if( VIP_VIM > 0.719057 )
				if( VIP_VIM <= 1.16374 )
					if( Negative_Money_Flow <= 360.256 )
						if( Positive_Money_Flow <= 2.52836e+06 )
							if( Positive_Money_Flow_Sum <= 1.55843e+07 )
								if( MFI_High <= 17.4277 )
									ret := 0.114286
								if( MFI_High > 17.4277 )
									ret := -0.346154
							if( Positive_Money_Flow_Sum > 1.55843e+07 )
								ret := -0.888889 // sell
						if( Positive_Money_Flow > 2.52836e+06 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow > 360.256 )
						if( VIP <= 3.46456 )
							ret := -0.062500
						if( VIP > 3.46456 )
							ret := 0.785714 // buy
				if( VIP_VIM > 1.16374 )
					if( Typical_Price <= 12.025 )
						if( VIP_VIM <= 1.54829 )
							ret := 0.583333
						if( VIP_VIM > 1.54829 )
							ret := 1.000000 // buy
					if( Typical_Price > 12.025 )
						if( MFI <= 98.6036 )
							if( VIP_VIM <= 1.32684 )
								ret := 0.600000
							if( VIP_VIM > 1.32684 )
								ret := 0.200000
						if( MFI > 98.6036 )
							ret := -0.062500
	
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
float op_operation = decision_tree_0_LYFT_1Min_25a0195a(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


