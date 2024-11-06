//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AMZN_5Min_2CM0_ab28369b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_2CM0_ab28369b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_ab28369b(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.09495e+07 )
		if( Raw_Money_Flow <= 3.05107e+08 )
			if( Positive_Money_Flow <= 10093 )
				if( ad <= -22.1863 )
					if( MFI_High <= -14.2988 )
						if( Positive_Money_Flow_Sum <= 259716 )
							if( MFI_High <= -74.2503 )
								ret := -0.090909
							if( MFI_High > -74.2503 )
								if( ad <= -2300.65 )
									ret := -1.000000 // sell
								if( ad > -2300.65 )
									ret := -0.692308
						if( Positive_Money_Flow_Sum > 259716 )
							if( ad <= -1.14674e+06 )
								if( MFI_High <= -77.5834 )
									ret := 0.600000
								if( MFI_High > -77.5834 )
									ret := 1.000000 // buy
							if( ad > -1.14674e+06 )
								if( Raw_Money_Flow <= 2.69829e+08 )
									ret := 0.118277
								if( Raw_Money_Flow > 2.69829e+08 )
									ret := 1.000000 // buy
					if( MFI_High > -14.2988 )
						if( ad <= -10821 )
							ret := -0.800000 // sell
						if( ad > -10821 )
							if( mf <= 0.221614 )
								if( ad <= -312.966 )
									ret := 0.341867
								if( ad > -312.966 )
									ret := 0.711538 // buy
							if( mf > 0.221614 )
								if( Typical_Price <= 155.72 )
									ret := 0.377907
								if( Typical_Price > 155.72 )
									ret := -0.077519
				if( ad > -22.1863 )
					if( Negative_Money_Flow <= 2.2413e+08 )
						if( Negative_Money_Flow <= 6.3953e+06 )
							if( Negative_Money_Flow_Sum <= 8.48741e+06 )
								if( ad_mf <= 2885.49 )
									ret := 0.049935
								if( ad_mf > 2885.49 )
									ret := 0.211207
							if( Negative_Money_Flow_Sum > 8.48741e+06 )
								if( Raw_Money_Flow <= 2.43622e+06 )
									ret := 0.001239
								if( Raw_Money_Flow > 2.43622e+06 )
									ret := -0.424837
						if( Negative_Money_Flow > 6.3953e+06 )
							if( Typical_Price <= 152.491 )
								if( mf <= 0.005255 )
									ret := -0.850000 // sell
								if( mf > 0.005255 )
									ret := 0.309278
							if( Typical_Price > 152.491 )
								if( mf <= -0.374884 )
									ret := -0.166667
								if( mf > -0.374884 )
									ret := 0.564103
					if( Negative_Money_Flow > 2.2413e+08 )
						if( Positive_Money_Flow_Sum <= 7.67231e+06 )
							ret := -0.916667 // sell
						if( Positive_Money_Flow_Sum > 7.67231e+06 )
							ret := 0.100000
			if( Positive_Money_Flow > 10093 )
				if( ad_mf <= -30.4915 )
					if( MFI <= 61.2135 )
						if( Money_Flow_Ratio <= 0.878787 )
							if( Raw_Money_Flow <= 197853 )
								if( MFI_High <= -65.7271 )
									ret := -0.075472
								if( MFI_High > -65.7271 )
									ret := 0.341176
							if( Raw_Money_Flow > 197853 )
								if( MFI_Low <= -11.6664 )
									ret := 0.366972
								if( MFI_Low > -11.6664 )
									ret := 0.020601
						if( Money_Flow_Ratio > 0.878787 )
							if( MFI_Low <= 36.6906 )
								if( Negative_Money_Flow_Sum <= 1.64655e+06 )
									ret := -0.414634
								if( Negative_Money_Flow_Sum > 1.64655e+06 )
									ret := -0.090164
							if( MFI_Low > 36.6906 )
								if( Raw_Money_Flow <= 94977.5 )
									ret := -0.607143
								if( Raw_Money_Flow > 94977.5 )
									ret := 0.181159
					if( MFI > 61.2135 )
						if( mf <= -0.446894 )
							if( ad <= -837.5 )
								if( MFI_High <= -12.8467 )
									ret := 0.040000
								if( MFI_High > -12.8467 )
									ret := -0.222222
							if( ad > -837.5 )
								ret := -0.700000 // sell
						if( mf > -0.446894 )
							if( Positive_Money_Flow_Sum <= 1.45768e+06 )
								if( MFI_Low <= 45.5159 )
									ret := 0.384615
								if( MFI_Low > 45.5159 )
									ret := 0.935484 // buy
							if( Positive_Money_Flow_Sum > 1.45768e+06 )
								if( ad_mf <= -3634.31 )
									ret := 0.317073
								if( ad_mf > -3634.31 )
									ret := 0.150219
				if( ad_mf > -30.4915 )
					if( MFI <= 18.9501 )
						if( Positive_Money_Flow_Sum <= 3.04971e+06 )
							if( Typical_Price <= 142.324 )
								if( Money_Flow_Ratio <= 0.219766 )
									ret := -0.032787
								if( Money_Flow_Ratio > 0.219766 )
									ret := 0.551724
							if( Typical_Price > 142.324 )
								if( Positive_Money_Flow <= 679499 )
									ret := 0.244604
								if( Positive_Money_Flow > 679499 )
									ret := 0.666667
						if( Positive_Money_Flow_Sum > 3.04971e+06 )
							if( mf <= 0.490149 )
								if( mf <= -0.621317 )
									ret := 0.500000
								if( mf > -0.621317 )
									ret := -0.044444
							if( mf > 0.490149 )
								if( Positive_Money_Flow_Sum <= 6.03764e+06 )
									ret := -0.100000
								if( Positive_Money_Flow_Sum > 6.03764e+06 )
									ret := -0.673913
					if( MFI > 18.9501 )
						if( MFI_High <= -37.5362 )
							if( Typical_Price <= 174.926 )
								if( Typical_Price <= 130.249 )
									ret := -0.007590
								if( Typical_Price > 130.249 )
									ret := -0.205312
							if( Typical_Price > 174.926 )
								if( Positive_Money_Flow_Sum <= 4.57052e+06 )
									ret := 0.076233
								if( Positive_Money_Flow_Sum > 4.57052e+06 )
									ret := -0.197248
						if( MFI_High > -37.5362 )
							if( ad <= 4834.9 )
								if( MFI <= 42.6893 )
									ret := 0.583333
								if( MFI > 42.6893 )
									ret := -0.053225
							if( ad > 4834.9 )
								if( ad <= 17961.6 )
									ret := 0.104921
								if( ad > 17961.6 )
									ret := -0.275000
		if( Raw_Money_Flow > 3.05107e+08 )
			if( Negative_Money_Flow <= 3.24225e+08 )
				ret := -1.000000 // sell
			if( Negative_Money_Flow > 3.24225e+08 )
				if( Typical_Price <= 167.803 )
					ret := -0.666667
				if( Typical_Price > 167.803 )
					ret := 0.666667
	if( Positive_Money_Flow_Sum > 1.09495e+07 )
		if( Raw_Money_Flow <= 3.75823e+07 )
			if( MFI <= 68.3094 )
				if( ad_mf <= 2817.67 )
					if( Positive_Money_Flow_Sum <= 2.03223e+07 )
						if( MFI_High <= -38.8719 )
							if( Positive_Money_Flow_Sum <= 1.83684e+07 )
								if( MFI_High <= -62.2616 )
									ret := 0.242038
								if( MFI_High > -62.2616 )
									ret := -0.009554
							if( Positive_Money_Flow_Sum > 1.83684e+07 )
								if( Negative_Money_Flow <= 5.13891e+06 )
									ret := -0.428571
								if( Negative_Money_Flow > 5.13891e+06 )
									ret := 0.380952
						if( MFI_High > -38.8719 )
							if( Negative_Money_Flow <= 2.44991e+06 )
								if( Positive_Money_Flow_Sum <= 1.81741e+07 )
									ret := -0.002215
								if( Positive_Money_Flow_Sum > 1.81741e+07 )
									ret := 0.337838
							if( Negative_Money_Flow > 2.44991e+06 )
								if( Positive_Money_Flow_Sum <= 1.27944e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.27944e+07 )
									ret := 0.492147
					if( Positive_Money_Flow_Sum > 2.03223e+07 )
						if( Negative_Money_Flow <= 3.14068e+06 )
							if( Money_Flow_Ratio <= 1.94887 )
								if( ad_mf <= -193198 )
									ret := -0.657143
								if( ad_mf > -193198 )
									ret := 0.016745
							if( Money_Flow_Ratio > 1.94887 )
								if( ad <= -35913.6 )
									ret := -0.653846
								if( ad > -35913.6 )
									ret := -0.192593
						if( Negative_Money_Flow > 3.14068e+06 )
							if( MFI_Low <= 38.2107 )
								if( Money_Flow_Ratio <= 0.776992 )
									ret := -0.052211
								if( Money_Flow_Ratio > 0.776992 )
									ret := -0.225092
							if( MFI_Low > 38.2107 )
								if( Raw_Money_Flow <= 3.35477e+07 )
									ret := -0.040516
								if( Raw_Money_Flow > 3.35477e+07 )
									ret := 0.362745
				if( ad_mf > 2817.67 )
					if( Money_Flow_Ratio <= 2.12628 )
						if( mf <= -0.244942 )
							if( ad_mf <= 74236.3 )
								if( Money_Flow_Ratio <= 0.330582 )
									ret := 0.065728
								if( Money_Flow_Ratio > 0.330582 )
									ret := -0.382749
							if( ad_mf > 74236.3 )
								if( Positive_Money_Flow_Sum <= 2.57403e+08 )
									ret := -0.709091 // sell
								if( Positive_Money_Flow_Sum > 2.57403e+08 )
									ret := 0.000000
						if( mf > -0.244942 )
							if( Negative_Money_Flow_Sum <= 2.28668e+08 )
								if( ad_mf <= 2971.91 )
									ret := -0.735294 // sell
								if( ad_mf > 2971.91 )
									ret := -0.146113
							if( Negative_Money_Flow_Sum > 2.28668e+08 )
								if( MFI <= 53.6956 )
									ret := -0.089794
								if( MFI > 53.6956 )
									ret := 0.083210
					if( Money_Flow_Ratio > 2.12628 )
						if( ad_mf <= 6685.02 )
							ret := -0.944444 // sell
						if( ad_mf > 6685.02 )
							if( Raw_Money_Flow <= 1.05741e+07 )
								ret := -0.700000 // sell
							if( Raw_Money_Flow > 1.05741e+07 )
								ret := -0.090909
			if( MFI > 68.3094 )
				if( Typical_Price <= 138.378 )
					if( Money_Flow_Ratio <= 2.35941 )
						if( Raw_Money_Flow <= 2.33985e+06 )
							if( Negative_Money_Flow_Sum <= 3.35481e+07 )
								if( ad_mf <= -3088.5 )
									ret := -0.272727
								if( ad_mf > -3088.5 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 3.35481e+07 )
								ret := 0.000000
						if( Raw_Money_Flow > 2.33985e+06 )
							if( Negative_Money_Flow_Sum <= 2.64699e+08 )
								if( ad <= -63928.7 )
									ret := -0.068966
								if( ad > -63928.7 )
									ret := 0.601504
							if( Negative_Money_Flow_Sum > 2.64699e+08 )
								ret := -0.166667
					if( Money_Flow_Ratio > 2.35941 )
						if( Positive_Money_Flow <= 2.87545e+06 )
							if( mf <= 0.578353 )
								if( ad_mf <= 15913.5 )
									ret := 0.012658
								if( ad_mf > 15913.5 )
									ret := -0.307087
							if( mf > 0.578353 )
								if( Negative_Money_Flow_Sum <= 1.12527e+07 )
									ret := 0.071429
								if( Negative_Money_Flow_Sum > 1.12527e+07 )
									ret := 0.855072 // buy
						if( Positive_Money_Flow > 2.87545e+06 )
							if( Positive_Money_Flow_Sum <= 1.88681e+09 )
								if( Positive_Money_Flow <= 3.57398e+06 )
									ret := 0.605634
								if( Positive_Money_Flow > 3.57398e+06 )
									ret := 0.011848
							if( Positive_Money_Flow_Sum > 1.88681e+09 )
								if( Raw_Money_Flow <= 1.46181e+07 )
									ret := 0.846154 // buy
								if( Raw_Money_Flow > 1.46181e+07 )
									ret := 1.000000 // buy
				if( Typical_Price > 138.378 )
					if( Typical_Price <= 172.692 )
						if( ad_mf <= -3487.17 )
							if( Negative_Money_Flow <= 40081.9 )
								if( MFI <= 86.9599 )
									ret := -0.258065
								if( MFI > 86.9599 )
									ret := 0.129630
							if( Negative_Money_Flow > 40081.9 )
								if( Negative_Money_Flow_Sum <= 2.04793e+07 )
									ret := 0.355191
								if( Negative_Money_Flow_Sum > 2.04793e+07 )
									ret := 0.020408
						if( ad_mf > -3487.17 )
							if( MFI_High <= -9.52882 )
								if( Positive_Money_Flow <= 2.67274e+07 )
									ret := 0.008000
								if( Positive_Money_Flow > 2.67274e+07 )
									ret := 0.567568
							if( MFI_High > -9.52882 )
								if( Positive_Money_Flow_Sum <= 2.81403e+07 )
									ret := -0.404651
								if( Positive_Money_Flow_Sum > 2.81403e+07 )
									ret := -0.093640
					if( Typical_Price > 172.692 )
						if( Negative_Money_Flow <= 655739 )
							if( Positive_Money_Flow_Sum <= 2.31537e+07 )
								if( ad <= -5878.5 )
									ret := 0.612245
								if( ad > -5878.5 )
									ret := 0.042895
							if( Positive_Money_Flow_Sum > 2.31537e+07 )
								if( Positive_Money_Flow_Sum <= 6.72348e+07 )
									ret := -0.225581
								if( Positive_Money_Flow_Sum > 6.72348e+07 )
									ret := -0.058195
						if( Negative_Money_Flow > 655739 )
							if( MFI_Low <= 50.2652 )
								if( Negative_Money_Flow_Sum <= 7.41716e+07 )
									ret := -0.675676
								if( Negative_Money_Flow_Sum > 7.41716e+07 )
									ret := -0.027778
							if( MFI_Low > 50.2652 )
								if( Positive_Money_Flow <= 145328 )
									ret := 0.168103
								if( Positive_Money_Flow > 145328 )
									ret := 0.809524 // buy
		if( Raw_Money_Flow > 3.75823e+07 )
			if( Positive_Money_Flow <= 8.39564e+07 )
				if( Money_Flow_Ratio <= 5.59965 )
					if( MFI_Low <= 60.2958 )
						if( Negative_Money_Flow_Sum <= 3.43739e+08 )
							if( Positive_Money_Flow <= 7.87738e+07 )
								if( Positive_Money_Flow_Sum <= 6.5942e+08 )
									ret := 0.093085
								if( Positive_Money_Flow_Sum > 6.5942e+08 )
									ret := -0.142715
							if( Positive_Money_Flow > 7.87738e+07 )
								if( Negative_Money_Flow_Sum <= 2.87944e+08 )
									ret := -0.424460
								if( Negative_Money_Flow_Sum > 2.87944e+08 )
									ret := 0.026667
						if( Negative_Money_Flow_Sum > 3.43739e+08 )
							if( Money_Flow_Ratio <= 0.694663 )
								if( MFI_High <= -67.6047 )
									ret := -0.128558
								if( MFI_High > -67.6047 )
									ret := 0.050991
							if( Money_Flow_Ratio > 0.694663 )
								if( Negative_Money_Flow <= 6.91439e+07 )
									ret := 0.003049
								if( Negative_Money_Flow > 6.91439e+07 )
									ret := -0.119403
					if( MFI_Low > 60.2958 )
						if( Negative_Money_Flow_Sum <= 1.66906e+08 )
							if( Raw_Money_Flow <= 4.45459e+07 )
								if( Negative_Money_Flow_Sum <= 8.79e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 8.79e+07 )
									ret := -0.054795
							if( Raw_Money_Flow > 4.45459e+07 )
								if( Positive_Money_Flow <= 8.07491e+07 )
									ret := -0.453237
								if( Positive_Money_Flow > 8.07491e+07 )
									ret := 0.700000 // buy
						if( Negative_Money_Flow_Sum > 1.66906e+08 )
							if( Positive_Money_Flow_Sum <= 1.07647e+09 )
								if( Money_Flow_Ratio <= 4.63631 )
									ret := -0.152542
								if( Money_Flow_Ratio > 4.63631 )
									ret := 0.584416
							if( Positive_Money_Flow_Sum > 1.07647e+09 )
								if( Negative_Money_Flow <= 1.66543e+08 )
									ret := -0.328125
								if( Negative_Money_Flow > 1.66543e+08 )
									ret := 0.480000
				if( Money_Flow_Ratio > 5.59965 )
					if( Positive_Money_Flow_Sum <= 2.15638e+09 )
						if( Typical_Price <= 181.77 )
							if( Positive_Money_Flow <= 4.26836e+07 )
								if( Negative_Money_Flow_Sum <= 1.81399e+08 )
									ret := 0.692308
								if( Negative_Money_Flow_Sum > 1.81399e+08 )
									ret := -0.205882
							if( Positive_Money_Flow > 4.26836e+07 )
								if( Typical_Price <= 142.461 )
									ret := -0.245902
								if( Typical_Price > 142.461 )
									ret := 0.062500
						if( Typical_Price > 181.77 )
							if( Positive_Money_Flow_Sum <= 4.65499e+08 )
								ret := -0.307692
							if( Positive_Money_Flow_Sum > 4.65499e+08 )
								if( MFI <= 90.5652 )
									ret := 0.597701
								if( MFI > 90.5652 )
									ret := 0.849057 // buy
					if( Positive_Money_Flow_Sum > 2.15638e+09 )
						if( Typical_Price <= 138.313 )
							ret := 0.333333
						if( Typical_Price > 138.313 )
							if( Negative_Money_Flow_Sum <= 4.60165e+08 )
								if( ad_mf <= -114328 )
									ret := -0.636364
								if( ad_mf > -114328 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.60165e+08 )
								ret := 0.625000
			if( Positive_Money_Flow > 8.39564e+07 )
				if( Typical_Price <= 183.627 )
					if( Negative_Money_Flow_Sum <= 1.4533e+09 )
						if( MFI <= 28.5397 )
							if( Money_Flow_Ratio <= 0.164449 )
								if( Positive_Money_Flow <= 9.52098e+07 )
									ret := -0.555556
								if( Positive_Money_Flow > 9.52098e+07 )
									ret := 0.703704 // buy
							if( Money_Flow_Ratio > 0.164449 )
								if( Positive_Money_Flow_Sum <= 2.97452e+08 )
									ret := -0.476190
								if( Positive_Money_Flow_Sum > 2.97452e+08 )
									ret := -0.140187
						if( MFI > 28.5397 )
							if( Typical_Price <= 146.527 )
								if( Positive_Money_Flow_Sum <= 2.72084e+08 )
									ret := 0.755319 // buy
								if( Positive_Money_Flow_Sum > 2.72084e+08 )
									ret := -0.030467
							if( Typical_Price > 146.527 )
								if( MFI <= 31.029 )
									ret := 0.441176
								if( MFI > 31.029 )
									ret := -0.125506
					if( Negative_Money_Flow_Sum > 1.4533e+09 )
						if( Negative_Money_Flow_Sum <= 1.64677e+09 )
							if( mf <= 0.232847 )
								if( Positive_Money_Flow <= 1.17442e+08 )
									ret := 0.896104 // buy
								if( Positive_Money_Flow > 1.17442e+08 )
									ret := 0.641026
							if( mf > 0.232847 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.64677e+09 )
							if( MFI <= 66.5975 )
								if( MFI_High <= -47.5582 )
									ret := -0.005848
								if( MFI_High > -47.5582 )
									ret := -0.417391
							if( MFI > 66.5975 )
								ret := 1.000000 // buy
				if( Typical_Price > 183.627 )
					if( MFI_Low <= 12.4351 )
						if( ad_mf <= 477898 )
							if( Typical_Price <= 187.956 )
								if( Positive_Money_Flow <= 1.32764e+08 )
									ret := -0.766667 // sell
								if( Positive_Money_Flow > 1.32764e+08 )
									ret := -1.000000 // sell
							if( Typical_Price > 187.956 )
								if( Positive_Money_Flow_Sum <= 3.53212e+08 )
									ret := -0.388889
								if( Positive_Money_Flow_Sum > 3.53212e+08 )
									ret := -0.857143 // sell
						if( ad_mf > 477898 )
							if( Typical_Price <= 184.301 )
								ret := 0.214286
							if( Typical_Price > 184.301 )
								ret := -0.700000 // sell
					if( MFI_Low > 12.4351 )
						if( MFI_High <= -25.0231 )
							if( Raw_Money_Flow <= 8.93914e+07 )
								if( MFI_High <= -37.875 )
									ret := -0.090909
								if( MFI_High > -37.875 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 8.93914e+07 )
								if( Money_Flow_Ratio <= 1.12696 )
									ret := -0.087558
								if( Money_Flow_Ratio > 1.12696 )
									ret := 0.520000
						if( MFI_High > -25.0231 )
							if( Typical_Price <= 191.5 )
								if( mf <= 0.120533 )
									ret := -0.548780
								if( mf > 0.120533 )
									ret := -0.301948
							if( Typical_Price > 191.5 )
								if( mf <= 0.133673 )
									ret := -0.548387
								if( mf > 0.133673 )
									ret := 0.134831
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMZN_5Min_ab28369b(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


