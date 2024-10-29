//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: SNOW_1Min_2MV0_8cc37d82 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2MV0_8cc37d82", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_8cc37d82(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP_VIM <= 0.852978 )
		if( Negative_Money_Flow <= 1555.12 )
			if( VIM <= 1.32847 )
				if( Negative_Money_Flow_Sum <= 2.03934e+07 )
					if( Positive_Money_Flow <= 127561 )
						if( VIP <= 1.33226 )
							if( VIM <= 0.899128 )
								if( Positive_Money_Flow_Sum <= 5.57362e+06 )
									ret := 0.214286
								if( Positive_Money_Flow_Sum > 5.57362e+06 )
									ret := -0.569231
							if( VIM > 0.899128 )
								if( Negative_Money_Flow_Sum <= 4.46779e+06 )
									ret := 0.019531
								if( Negative_Money_Flow_Sum > 4.46779e+06 )
									ret := -0.235669
						if( VIP > 1.33226 )
							if( MFI <= 74.0732 )
								if( VIM <= 1.11305 )
									ret := -0.352941
								if( VIM > 1.11305 )
									ret := -0.640449
							if( MFI > 74.0732 )
								if( MFI <= 78.4 )
									ret := 0.350000
								if( MFI > 78.4 )
									ret := -0.422680
					if( Positive_Money_Flow > 127561 )
						if( Raw_Money_Flow <= 9.84713e+06 )
							if( MFI_High <= 13.9881 )
								if( Raw_Money_Flow <= 3.72949e+06 )
									ret := 0.006339
								if( Raw_Money_Flow > 3.72949e+06 )
									ret := 0.137828
							if( MFI_High > 13.9881 )
								if( Negative_Money_Flow_Sum <= 684014 )
									ret := 0.604839
								if( Negative_Money_Flow_Sum > 684014 )
									ret := 0.029703
						if( Raw_Money_Flow > 9.84713e+06 )
							if( VIP_VIM <= -0.01208 )
								if( Positive_Money_Flow_Sum <= 1.79242e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.79242e+07 )
									ret := 0.272727
							if( VIP_VIM > -0.01208 )
								if( Positive_Money_Flow_Sum <= 2.05029e+08 )
									ret := -0.504902
								if( Positive_Money_Flow_Sum > 2.05029e+08 )
									ret := 0.714286 // buy
				if( Negative_Money_Flow_Sum > 2.03934e+07 )
					if( Typical_Price <= 162.705 )
						if( VIP <= 0.687499 )
							if( VIM <= 1.3172 )
								if( VIM <= 1.28919 )
									ret := 0.026316
								if( VIM > 1.28919 )
									ret := 0.725490 // buy
							if( VIM > 1.3172 )
								if( MFI <= 23.9321 )
									ret := -0.437500
								if( MFI > 23.9321 )
									ret := 0.090909
						if( VIP > 0.687499 )
							if( Raw_Money_Flow <= 1.83368e+08 )
								if( Positive_Money_Flow <= 7.35222e+06 )
									ret := -0.140693
								if( Positive_Money_Flow > 7.35222e+06 )
									ret := 0.064242
							if( Raw_Money_Flow > 1.83368e+08 )
								if( VIP_VIM <= 0.19831 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.19831 )
									ret := -0.687500
					if( Typical_Price > 162.705 )
						if( VIP <= 0.765343 )
							ret := 0.000000
						if( VIP > 0.765343 )
							if( Raw_Money_Flow <= 2.75809e+06 )
								if( VIM <= 1.09866 )
									ret := -0.437500
								if( VIM > 1.09866 )
									ret := -0.800000 // sell
							if( Raw_Money_Flow > 2.75809e+06 )
								if( Typical_Price <= 165.231 )
									ret := -0.727273 // sell
								if( Typical_Price > 165.231 )
									ret := -1.000000 // sell
			if( VIM > 1.32847 )
				if( Positive_Money_Flow_Sum <= 124333 )
					if( Money_Flow_Ratio <= 0.436228 )
						if( Money_Flow_Ratio <= 0.127132 )
							if( MFI <= 7.47819 )
								ret := 0.166667
							if( MFI > 7.47819 )
								ret := 0.000000
						if( Money_Flow_Ratio > 0.127132 )
							if( MFI <= 26.8832 )
								if( VIM <= 15.2082 )
									ret := 0.478261
								if( VIM > 15.2082 )
									ret := 0.864865 // buy
							if( MFI > 26.8832 )
								ret := 0.250000
					if( Money_Flow_Ratio > 0.436228 )
						if( MFI <= 37.2604 )
							ret := -0.538462
						if( MFI > 37.2604 )
							ret := 0.000000
				if( Positive_Money_Flow_Sum > 124333 )
					if( Positive_Money_Flow <= 9660.7 )
						if( Raw_Money_Flow <= 54909.2 )
							if( Positive_Money_Flow <= 35.3735 )
								if( VIP_VIM <= 0.408759 )
									ret := 0.241692
								if( VIP_VIM > 0.408759 )
									ret := -0.031250
							if( Positive_Money_Flow > 35.3735 )
								if( Typical_Price <= 126.409 )
									ret := 0.190476
								if( Typical_Price > 126.409 )
									ret := 0.849057 // buy
						if( Raw_Money_Flow > 54909.2 )
							if( VIM <= 3.21972 )
								if( MFI_High <= 7.58808 )
									ret := -0.297619
								if( MFI_High > 7.58808 )
									ret := -0.764706 // sell
							if( VIM > 3.21972 )
								if( MFI_High <= -26.9335 )
									ret := 0.272727
								if( MFI_High > -26.9335 )
									ret := -0.150000
					if( Positive_Money_Flow > 9660.7 )
						if( Negative_Money_Flow_Sum <= 1.87249e+07 )
							if( Positive_Money_Flow_Sum <= 5.49543e+06 )
								if( Typical_Price <= 154.154 )
									ret := -0.191276
								if( Typical_Price > 154.154 )
									ret := -0.022339
							if( Positive_Money_Flow_Sum > 5.49543e+06 )
								if( Negative_Money_Flow_Sum <= 1.08349e+07 )
									ret := -0.106838
								if( Negative_Money_Flow_Sum > 1.08349e+07 )
									ret := 0.550000
						if( Negative_Money_Flow_Sum > 1.87249e+07 )
							if( Typical_Price <= 114.127 )
								if( Positive_Money_Flow <= 1.77619e+06 )
									ret := 0.397059
								if( Positive_Money_Flow > 1.77619e+06 )
									ret := -0.363636
							if( Typical_Price > 114.127 )
								if( MFI_High <= -77.8269 )
									ret := 0.020833
								if( MFI_High > -77.8269 )
									ret := -0.439914
		if( Negative_Money_Flow > 1555.12 )
			if( Raw_Money_Flow <= 165701 )
				if( Money_Flow_Ratio <= 0.005313 )
					if( VIM <= 2.19834 )
						ret := 0.666667
					if( VIM > 2.19834 )
						if( Negative_Money_Flow_Sum <= 7.82713e+07 )
							if( MFI <= 0.297707 )
								ret := -1.000000 // sell
							if( MFI > 0.297707 )
								ret := -0.777778 // sell
						if( Negative_Money_Flow_Sum > 7.82713e+07 )
							ret := -0.500000
				if( Money_Flow_Ratio > 0.005313 )
					if( MFI_Low <= 28.094 )
						if( Positive_Money_Flow <= 1947 )
							if( MFI_High <= -53.5512 )
								if( VIP <= 10.0744 )
									ret := 0.312552
								if( VIP > 10.0744 )
									ret := 0.673387
							if( MFI_High > -53.5512 )
								if( MFI_Low <= 16.0318 )
									ret := 0.164103
								if( MFI_Low > 16.0318 )
									ret := 0.312691
						if( Positive_Money_Flow > 1947 )
							if( Money_Flow_Ratio <= 0.050469 )
								if( Negative_Money_Flow <= 22486.5 )
									ret := 0.931034 // buy
								if( Negative_Money_Flow > 22486.5 )
									ret := 0.444444
							if( Money_Flow_Ratio > 0.050469 )
								if( MFI_High <= -67.3191 )
									ret := -0.826087 // sell
								if( MFI_High > -67.3191 )
									ret := 0.031250
					if( MFI_Low > 28.094 )
						if( Negative_Money_Flow_Sum <= 976891 )
							if( Positive_Money_Flow_Sum <= 769194 )
								if( Typical_Price <= 116.327 )
									ret := -0.081081
								if( Typical_Price > 116.327 )
									ret := 0.115684
							if( Positive_Money_Flow_Sum > 769194 )
								if( Negative_Money_Flow_Sum <= 167665 )
									ret := -0.441176
								if( Negative_Money_Flow_Sum > 167665 )
									ret := 0.337061
						if( Negative_Money_Flow_Sum > 976891 )
							if( Typical_Price <= 111.361 )
								if( Raw_Money_Flow <= 44297.8 )
									ret := 0.454545
								if( Raw_Money_Flow > 44297.8 )
									ret := -0.528571
							if( Typical_Price > 111.361 )
								if( Positive_Money_Flow <= 13480.1 )
									ret := -0.053226
								if( Positive_Money_Flow > 13480.1 )
									ret := 0.292308
			if( Raw_Money_Flow > 165701 )
				if( Negative_Money_Flow_Sum <= 1.10804e+07 )
					if( Positive_Money_Flow_Sum <= 620391 )
						if( Raw_Money_Flow <= 630646 )
							if( MFI_High <= -23.1512 )
								if( Negative_Money_Flow_Sum <= 6.17431e+06 )
									ret := 0.101786
								if( Negative_Money_Flow_Sum > 6.17431e+06 )
									ret := 0.750000 // buy
							if( MFI_High > -23.1512 )
								ret := 0.916667 // buy
						if( Raw_Money_Flow > 630646 )
							if( Typical_Price <= 135.724 )
								if( MFI_Low <= -4.86739 )
									ret := 0.842105 // buy
								if( MFI_Low > -4.86739 )
									ret := 0.419355
							if( Typical_Price > 135.724 )
								if( VIP_VIM <= -0.282354 )
									ret := -0.264706
								if( VIP_VIM > -0.282354 )
									ret := 0.785714 // buy
					if( Positive_Money_Flow_Sum > 620391 )
						if( VIP_VIM <= -0.824995 )
							if( VIP <= 2.3874 )
								if( Money_Flow_Ratio <= 0.471067 )
									ret := -0.331933
								if( Money_Flow_Ratio > 0.471067 )
									ret := -0.767857 // sell
							if( VIP > 2.3874 )
								if( VIP <= 4.12975 )
									ret := 0.571429
								if( VIP > 4.12975 )
									ret := -0.173913
						if( VIP_VIM > -0.824995 )
							if( MFI_High <= -2.7343 )
								if( Positive_Money_Flow_Sum <= 1.5426e+07 )
									ret := -0.032117
								if( Positive_Money_Flow_Sum > 1.5426e+07 )
									ret := -0.208263
							if( MFI_High > -2.7343 )
								if( Typical_Price <= 113.561 )
									ret := -0.157635
								if( Typical_Price > 113.561 )
									ret := 0.123693
				if( Negative_Money_Flow_Sum > 1.10804e+07 )
					if( VIM <= 1.04922 )
						if( Negative_Money_Flow <= 1.20972e+07 )
							if( MFI <= 74.3881 )
								if( Typical_Price <= 110.052 )
									ret := -0.653846
								if( Typical_Price > 110.052 )
									ret := 0.171192
							if( MFI > 74.3881 )
								if( VIP <= 1.29099 )
									ret := -0.265625
								if( VIP > 1.29099 )
									ret := 0.184783
						if( Negative_Money_Flow > 1.20972e+07 )
							if( MFI_High <= -23.51 )
								if( Negative_Money_Flow <= 2.97838e+07 )
									ret := 0.454545
								if( Negative_Money_Flow > 2.97838e+07 )
									ret := 0.913793 // buy
							if( MFI_High > -23.51 )
								if( MFI_Low <= 45.5897 )
									ret := -0.111111
								if( MFI_Low > 45.5897 )
									ret := 0.558140
					if( VIM > 1.04922 )
						if( Typical_Price <= 129.564 )
							if( Negative_Money_Flow_Sum <= 1.63579e+08 )
								if( Negative_Money_Flow_Sum <= 2.2205e+07 )
									ret := 0.164205
								if( Negative_Money_Flow_Sum > 2.2205e+07 )
									ret := -0.028302
							if( Negative_Money_Flow_Sum > 1.63579e+08 )
								if( Negative_Money_Flow <= 179223 )
									ret := -0.071429
								if( Negative_Money_Flow > 179223 )
									ret := 0.626016
						if( Typical_Price > 129.564 )
							if( MFI_Low <= -18.075 )
								if( VIP_VIM <= -0.77737 )
									ret := -0.854167 // sell
								if( VIP_VIM > -0.77737 )
									ret := 0.000000
							if( MFI_Low > -18.075 )
								if( Negative_Money_Flow <= 17475.2 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 17475.2 )
									ret := -0.038355
	if( VIP_VIM > 0.852978 )
		if( Money_Flow_Ratio <= 3.53072 )
			if( Positive_Money_Flow <= 3247.08 )
				if( VIM <= 4.66989 )
					if( MFI_Low <= 53.5333 )
						if( Negative_Money_Flow_Sum <= 1.40748e+06 )
							if( MFI <= 51.5928 )
								if( VIM <= 2.87639 )
									ret := -0.823529 // sell
								if( VIM > 2.87639 )
									ret := -0.214286
							if( MFI > 51.5928 )
								if( MFI_Low <= 34.1414 )
									ret := 0.761905 // buy
								if( MFI_Low > 34.1414 )
									ret := -0.253425
						if( Negative_Money_Flow_Sum > 1.40748e+06 )
							if( VIP <= 2.12089 )
								if( Raw_Money_Flow <= 649626 )
									ret := 0.000000
								if( Raw_Money_Flow > 649626 )
									ret := -0.100000
							if( VIP > 2.12089 )
								if( Typical_Price <= 135.845 )
									ret := 0.266667
								if( Typical_Price > 135.845 )
									ret := 1.000000 // buy
					if( MFI_Low > 53.5333 )
						if( Typical_Price <= 124.145 )
							ret := -0.470588
						if( Typical_Price > 124.145 )
							if( Money_Flow_Ratio <= 2.96626 )
								if( Negative_Money_Flow <= 76052.2 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 76052.2 )
									ret := 0.454545
							if( Money_Flow_Ratio > 2.96626 )
								if( Typical_Price <= 135.366 )
									ret := -0.153846
								if( Typical_Price > 135.366 )
									ret := 0.500000
				if( VIM > 4.66989 )
					if( MFI_Low <= 52.1392 )
						if( Negative_Money_Flow <= 24015.6 )
							if( VIP <= 77.9994 )
								if( Raw_Money_Flow <= 14858.2 )
									ret := 0.571429
								if( Raw_Money_Flow > 14858.2 )
									ret := 0.051724
							if( VIP > 77.9994 )
								ret := -0.461538
						if( Negative_Money_Flow > 24015.6 )
							if( MFI_Low <= 9.83247 )
								ret := -0.400000
							if( MFI_Low > 9.83247 )
								if( Negative_Money_Flow <= 197693 )
									ret := 0.533898
								if( Negative_Money_Flow > 197693 )
									ret := -0.416667
					if( MFI_Low > 52.1392 )
						if( Positive_Money_Flow_Sum <= 884408 )
							if( Negative_Money_Flow <= 38347.5 )
								ret := -0.625000
							if( Negative_Money_Flow > 38347.5 )
								ret := 0.583333
						if( Positive_Money_Flow_Sum > 884408 )
							ret := -0.800000 // sell
			if( Positive_Money_Flow > 3247.08 )
				if( Raw_Money_Flow <= 1.20227e+06 )
					if( Money_Flow_Ratio <= 0.329984 )
						ret := -0.727273 // sell
					if( Money_Flow_Ratio > 0.329984 )
						if( MFI_High <= -41.2743 )
							if( VIP_VIM <= 1.03312 )
								ret := -0.400000
							if( VIP_VIM > 1.03312 )
								if( VIM <= 18.8581 )
									ret := 0.642857
								if( VIM > 18.8581 )
									ret := -0.062500
						if( MFI_High > -41.2743 )
							if( MFI_High <= -24.3168 )
								if( Raw_Money_Flow <= 18766.3 )
									ret := 0.292683
								if( Raw_Money_Flow > 18766.3 )
									ret := -0.567568
							if( MFI_High > -24.3168 )
								if( VIP_VIM <= 1.31147 )
									ret := -0.330033
								if( VIP_VIM > 1.31147 )
									ret := 0.010526
				if( Raw_Money_Flow > 1.20227e+06 )
					if( Negative_Money_Flow_Sum <= 4.53945e+06 )
						ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 4.53945e+06 )
						ret := 0.384615
		if( Money_Flow_Ratio > 3.53072 )
			if( VIM <= 3.15706 )
				if( Raw_Money_Flow <= 13958.6 )
					ret := 0.842105 // buy
				if( Raw_Money_Flow > 13958.6 )
					if( MFI_Low <= 62.6477 )
						if( Positive_Money_Flow_Sum <= 3.78408e+06 )
							if( Positive_Money_Flow_Sum <= 1.70294e+06 )
								if( VIP <= 2.81916 )
									ret := -0.030303
								if( VIP > 2.81916 )
									ret := -0.486486
							if( Positive_Money_Flow_Sum > 1.70294e+06 )
								if( Raw_Money_Flow <= 186114 )
									ret := -0.882353 // sell
								if( Raw_Money_Flow > 186114 )
									ret := -0.684211
						if( Positive_Money_Flow_Sum > 3.78408e+06 )
							if( VIP_VIM <= 0.900329 )
								if( MFI_High <= -0.62436 )
									ret := 0.285714
								if( MFI_High > -0.62436 )
									ret := -0.074074
							if( VIP_VIM > 0.900329 )
								if( MFI <= 81.1188 )
									ret := -0.166667
								if( MFI > 81.1188 )
									ret := -0.625000
					if( MFI_Low > 62.6477 )
						if( VIM <= 0.909782 )
							if( Money_Flow_Ratio <= 50.4573 )
								if( Raw_Money_Flow <= 5.95393e+06 )
									ret := -0.138889
								if( Raw_Money_Flow > 5.95393e+06 )
									ret := -0.803922 // sell
							if( Money_Flow_Ratio > 50.4573 )
								if( VIP_VIM <= 0.989038 )
									ret := -0.900000 // sell
								if( VIP_VIM > 0.989038 )
									ret := -0.368421
						if( VIM > 0.909782 )
							if( MFI <= 90.7364 )
								if( VIP <= 2.79386 )
									ret := 0.450000
								if( VIP > 2.79386 )
									ret := -0.133333
							if( MFI > 90.7364 )
								if( Positive_Money_Flow_Sum <= 1.90373e+06 )
									ret := -0.466667
								if( Positive_Money_Flow_Sum > 1.90373e+06 )
									ret := -0.098039
			if( VIM > 3.15706 )
				if( MFI_Low <= 62.7208 )
					if( Positive_Money_Flow_Sum <= 850825 )
						if( Positive_Money_Flow_Sum <= 648699 )
							if( Positive_Money_Flow <= 10538.5 )
								ret := -0.619048
							if( Positive_Money_Flow > 10538.5 )
								ret := -0.090909
						if( Positive_Money_Flow_Sum > 648699 )
							if( Positive_Money_Flow_Sum <= 719867 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 719867 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 850825 )
						if( MFI_Low <= 59.991 )
							if( VIP_VIM <= 1.07446 )
								ret := -0.750000 // sell
							if( VIP_VIM > 1.07446 )
								if( VIP <= 12.1454 )
									ret := -1.000000 // sell
								if( VIP > 12.1454 )
									ret := -0.777778 // sell
						if( MFI_Low > 59.991 )
							if( VIP <= 10.8035 )
								if( Negative_Money_Flow_Sum <= 276147 )
									ret := -0.454545
								if( Negative_Money_Flow_Sum > 276147 )
									ret := 0.125000
							if( VIP > 10.8035 )
								ret := -0.625000
				if( MFI_Low > 62.7208 )
					if( Positive_Money_Flow_Sum <= 1.43052e+06 )
						if( Positive_Money_Flow_Sum <= 541945 )
							ret := 0.000000
						if( Positive_Money_Flow_Sum > 541945 )
							if( VIP <= 36.759 )
								if( VIP_VIM <= 0.893959 )
									ret := -0.166667
								if( VIP_VIM > 0.893959 )
									ret := -0.871287 // sell
							if( VIP > 36.759 )
								ret := -0.100000
					if( Positive_Money_Flow_Sum > 1.43052e+06 )
						if( Raw_Money_Flow <= 65760.5 )
							if( MFI_Low <= 68.9609 )
								ret := 0.785714 // buy
							if( MFI_Low > 68.9609 )
								if( VIM <= 6.38289 )
									ret := -1.000000 // sell
								if( VIM > 6.38289 )
									ret := -0.083333
						if( Raw_Money_Flow > 65760.5 )
							if( VIP <= 7.45237 )
								if( Positive_Money_Flow <= 6906.64 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow > 6906.64 )
									ret := -0.956522 // sell
							if( VIP > 7.45237 )
								ret := -0.647059
	
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
float op_operation = decision_tree_0_SNOW_1Min_8cc37d82(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


