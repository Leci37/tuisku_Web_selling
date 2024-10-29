//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: SHIBUSDT_5Min_2MV0_828ca0e2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_5Min_2MV0_828ca0e2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_5Min_828ca0e2(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 111.773 )
		if( VIP <= 1.16192 )
			if( Negative_Money_Flow_Sum <= 2.85676e+06 )
				if( VIP <= 0.686568 )
					if( Raw_Money_Flow <= 139887 )
						if( VIM <= 1.26101 )
							ret := -0.571429
						if( VIM > 1.26101 )
							if( Positive_Money_Flow_Sum <= 366946 )
								if( Negative_Money_Flow_Sum <= 1.42693e+06 )
									ret := 0.518519
								if( Negative_Money_Flow_Sum > 1.42693e+06 )
									ret := -0.400000
							if( Positive_Money_Flow_Sum > 366946 )
								ret := -0.600000
					if( Raw_Money_Flow > 139887 )
						if( Positive_Money_Flow_Sum <= 305306 )
							if( Positive_Money_Flow <= 152562 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 152562 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 305306 )
							if( VIP <= 0.684988 )
								if( MFI <= 15.2407 )
									ret := 0.500000
								if( MFI > 15.2407 )
									ret := 0.907407 // buy
							if( VIP > 0.684988 )
								ret := 0.333333
				if( VIP > 0.686568 )
					if( VIM <= 0.999963 )
						if( Positive_Money_Flow <= 3.75846e+06 )
							if( Negative_Money_Flow_Sum <= 2.53031e+06 )
								if( Positive_Money_Flow_Sum <= 5.661e+06 )
									ret := 0.024525
								if( Positive_Money_Flow_Sum > 5.661e+06 )
									ret := -0.291667
							if( Negative_Money_Flow_Sum > 2.53031e+06 )
								if( Positive_Money_Flow <= 468979 )
									ret := 0.367542
								if( Positive_Money_Flow > 468979 )
									ret := -0.071429
						if( Positive_Money_Flow > 3.75846e+06 )
							if( Negative_Money_Flow_Sum <= 2.698e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.698e+06 )
								ret := -0.500000
					if( VIM > 0.999963 )
						if( Raw_Money_Flow <= 766004 )
							if( Positive_Money_Flow_Sum <= 1.78486e+06 )
								if( Negative_Money_Flow_Sum <= 1.67918e+06 )
									ret := -0.028054
								if( Negative_Money_Flow_Sum > 1.67918e+06 )
									ret := 0.049298
							if( Positive_Money_Flow_Sum > 1.78486e+06 )
								if( VIM <= 1.07265 )
									ret := -0.028747
								if( VIM > 1.07265 )
									ret := -0.286385
						if( Raw_Money_Flow > 766004 )
							if( Money_Flow_Ratio <= 1.47603 )
								if( Typical_Price <= 2.4e-05 )
									ret := 0.787234 // buy
								if( Typical_Price > 2.4e-05 )
									ret := -0.333333
							if( Money_Flow_Ratio > 1.47603 )
								if( Raw_Money_Flow <= 889285 )
									ret := 0.000000
								if( Raw_Money_Flow > 889285 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 2.85676e+06 )
				if( Money_Flow_Ratio <= 0.884377 )
					if( Negative_Money_Flow_Sum <= 3.3597e+07 )
						if( Raw_Money_Flow <= 1.06862e+06 )
							if( Positive_Money_Flow_Sum <= 587519 )
								if( VIP_VIM <= -0.527653 )
									ret := 0.480000
								if( VIP_VIM > -0.527653 )
									ret := -0.422680
							if( Positive_Money_Flow_Sum > 587519 )
								if( Money_Flow_Ratio <= 0.207417 )
									ret := 0.403909
								if( Money_Flow_Ratio > 0.207417 )
									ret := 0.133475
						if( Raw_Money_Flow > 1.06862e+06 )
							if( Positive_Money_Flow_Sum <= 4.81974e+06 )
								if( Typical_Price <= 2.7e-05 )
									ret := -0.070248
								if( Typical_Price > 2.7e-05 )
									ret := -0.737500 // sell
							if( Positive_Money_Flow_Sum > 4.81974e+06 )
								if( Negative_Money_Flow_Sum <= 1.5689e+07 )
									ret := 0.203840
								if( Negative_Money_Flow_Sum > 1.5689e+07 )
									ret := -0.032673
					if( Negative_Money_Flow_Sum > 3.3597e+07 )
						if( Money_Flow_Ratio <= 0.245146 )
							if( Negative_Money_Flow_Sum <= 3.81925e+07 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 3.81925e+07 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.245146 )
							if( Typical_Price <= 3.6e-05 )
								if( Raw_Money_Flow <= 1.04402e+07 )
									ret := 0.677507
								if( Raw_Money_Flow > 1.04402e+07 )
									ret := 0.226415
							if( Typical_Price > 3.6e-05 )
								if( Negative_Money_Flow_Sum <= 6.21619e+07 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 6.21619e+07 )
									ret := -0.508772
				if( Money_Flow_Ratio > 0.884377 )
					if( Positive_Money_Flow_Sum <= 3.25139e+06 )
						if( MFI_High <= -32.5057 )
							if( Typical_Price <= 1.3e-05 )
								if( Positive_Money_Flow_Sum <= 2.83698e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.83698e+06 )
									ret := -1.000000 // sell
							if( Typical_Price > 1.3e-05 )
								if( Raw_Money_Flow <= 767246 )
									ret := -0.080000
								if( Raw_Money_Flow > 767246 )
									ret := 0.833333 // buy
						if( MFI_High > -32.5057 )
							if( Positive_Money_Flow_Sum <= 3.09924e+06 )
								if( Positive_Money_Flow_Sum <= 2.93714e+06 )
									ret := 0.607843
								if( Positive_Money_Flow_Sum > 2.93714e+06 )
									ret := 0.094118
							if( Positive_Money_Flow_Sum > 3.09924e+06 )
								if( MFI_Low <= 30.5103 )
									ret := 0.859649 // buy
								if( MFI_Low > 30.5103 )
									ret := 0.538462
					if( Positive_Money_Flow_Sum > 3.25139e+06 )
						if( Negative_Money_Flow_Sum <= 1.0394e+08 )
							if( Typical_Price <= 3.9e-05 )
								if( VIP_VIM <= 0.235751 )
									ret := 0.015907
								if( VIP_VIM > 0.235751 )
									ret := -0.129384
							if( Typical_Price > 3.9e-05 )
								if( Money_Flow_Ratio <= 1.06709 )
									ret := -0.500000
								if( Money_Flow_Ratio > 1.06709 )
									ret := 0.829268 // buy
						if( Negative_Money_Flow_Sum > 1.0394e+08 )
							if( Positive_Money_Flow <= 1.14329e+07 )
								ret := -0.250000
							if( Positive_Money_Flow > 1.14329e+07 )
								ret := -1.000000 // sell
		if( VIP > 1.16192 )
			if( Raw_Money_Flow <= 122541 )
				if( VIM <= 0.62145 )
					if( VIP_VIM <= 0.843496 )
						if( Raw_Money_Flow <= 102305 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 102305 )
							ret := -0.750000 // sell
					if( VIP_VIM > 0.843496 )
						ret := 0.000000
				if( VIM > 0.62145 )
					if( Negative_Money_Flow_Sum <= 63994.1 )
						if( Positive_Money_Flow_Sum <= 802931 )
							if( Negative_Money_Flow_Sum <= 27329.1 )
								if( Positive_Money_Flow <= 15942.8 )
									ret := -0.183333
								if( Positive_Money_Flow > 15942.8 )
									ret := 0.131148
							if( Negative_Money_Flow_Sum > 27329.1 )
								if( VIP_VIM <= 0.56507 )
									ret := 0.255034
								if( VIP_VIM > 0.56507 )
									ret := -0.095238
						if( Positive_Money_Flow_Sum > 802931 )
							if( Raw_Money_Flow <= 96062.6 )
								if( VIP <= 1.27662 )
									ret := -1.000000 // sell
								if( VIP > 1.27662 )
									ret := -0.250000
							if( Raw_Money_Flow > 96062.6 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 63994.1 )
						if( Positive_Money_Flow_Sum <= 563006 )
							if( MFI_High <= 7.42547 )
								if( Raw_Money_Flow <= 74657.1 )
									ret := -0.063387
								if( Raw_Money_Flow > 74657.1 )
									ret := -0.239130
							if( MFI_High > 7.42547 )
								if( Positive_Money_Flow_Sum <= 504685 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 504685 )
									ret := -0.900000 // sell
						if( Positive_Money_Flow_Sum > 563006 )
							if( Positive_Money_Flow_Sum <= 702157 )
								if( Raw_Money_Flow <= 58005 )
									ret := 0.016598
								if( Raw_Money_Flow > 58005 )
									ret := 0.276596
							if( Positive_Money_Flow_Sum > 702157 )
								if( VIP_VIM <= 0.711281 )
									ret := -0.038146
								if( VIP_VIM > 0.711281 )
									ret := 0.500000
			if( Raw_Money_Flow > 122541 )
				if( MFI_High <= 0.466856 )
					if( Positive_Money_Flow_Sum <= 1.22987e+06 )
						if( Negative_Money_Flow_Sum <= 450895 )
							if( Money_Flow_Ratio <= 2.13228 )
								if( MFI_High <= -13.7527 )
									ret := 0.000000
								if( MFI_High > -13.7527 )
									ret := 0.631579
							if( Money_Flow_Ratio > 2.13228 )
								if( VIP_VIM <= 0.385516 )
									ret := 0.100000
								if( VIP_VIM > 0.385516 )
									ret := -0.313084
						if( Negative_Money_Flow_Sum > 450895 )
							if( VIM <= 0.875113 )
								if( Negative_Money_Flow_Sum <= 622700 )
									ret := -0.475610
								if( Negative_Money_Flow_Sum > 622700 )
									ret := -0.234375
							if( VIM > 0.875113 )
								if( Negative_Money_Flow_Sum <= 744639 )
									ret := -0.923077 // sell
								if( Negative_Money_Flow_Sum > 744639 )
									ret := -0.500000
					if( Positive_Money_Flow_Sum > 1.22987e+06 )
						if( Negative_Money_Flow_Sum <= 6.80313e+06 )
							if( VIM <= 0.7263 )
								if( Positive_Money_Flow_Sum <= 1.47632e+07 )
									ret := 0.070284
								if( Positive_Money_Flow_Sum > 1.47632e+07 )
									ret := 0.661290
							if( VIM > 0.7263 )
								if( VIP <= 1.30868 )
									ret := -0.065642
								if( VIP > 1.30868 )
									ret := -0.609756
						if( Negative_Money_Flow_Sum > 6.80313e+06 )
							if( Positive_Money_Flow_Sum <= 3.83157e+07 )
								if( VIP <= 1.179 )
									ret := 0.044248
								if( VIP > 1.179 )
									ret := -0.441176
							if( Positive_Money_Flow_Sum > 3.83157e+07 )
								if( VIP_VIM <= 0.507729 )
									ret := 0.256545
								if( VIP_VIM > 0.507729 )
									ret := -0.320000
				if( MFI_High > 0.466856 )
					if( Negative_Money_Flow_Sum <= 215526 )
						if( Money_Flow_Ratio <= 28.8937 )
							if( Typical_Price <= 2.4e-05 )
								if( MFI_Low <= 65.5716 )
									ret := 0.388350
								if( MFI_Low > 65.5716 )
									ret := 0.103376
							if( Typical_Price > 2.4e-05 )
								if( Negative_Money_Flow_Sum <= 182005 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 182005 )
									ret := -0.714286 // sell
						if( Money_Flow_Ratio > 28.8937 )
							if( Positive_Money_Flow <= 1.73513e+06 )
								if( Positive_Money_Flow_Sum <= 2.12469e+06 )
									ret := -0.153846
								if( Positive_Money_Flow_Sum > 2.12469e+06 )
									ret := -0.622222
							if( Positive_Money_Flow > 1.73513e+06 )
								ret := 0.285714
					if( Negative_Money_Flow_Sum > 215526 )
						if( Typical_Price <= 1.3e-05 )
							if( Raw_Money_Flow <= 219170 )
								if( Money_Flow_Ratio <= 4.67401 )
									ret := -0.487179
								if( Money_Flow_Ratio > 4.67401 )
									ret := 0.169014
							if( Raw_Money_Flow > 219170 )
								if( Money_Flow_Ratio <= 4.83753 )
									ret := -0.246753
								if( Money_Flow_Ratio > 4.83753 )
									ret := -0.601824
						if( Typical_Price > 1.3e-05 )
							if( Positive_Money_Flow_Sum <= 2.37535e+06 )
								if( MFI_Low <= 61.7487 )
									ret := -0.095238
								if( MFI_Low > 61.7487 )
									ret := -0.601896
							if( Positive_Money_Flow_Sum > 2.37535e+06 )
								if( Negative_Money_Flow_Sum <= 1.98723e+06 )
									ret := -0.075489
								if( Negative_Money_Flow_Sum > 1.98723e+06 )
									ret := -0.278523
	if( Negative_Money_Flow > 111.773 )
		if( MFI <= 22.8005 )
			if( Raw_Money_Flow <= 367611 )
				if( Money_Flow_Ratio <= 0.035585 )
					if( VIM <= 1.25826 )
						if( MFI <= 2.36424 )
							if( Negative_Money_Flow_Sum <= 899494 )
								if( Negative_Money_Flow <= 8253.57 )
									ret := 0.250000
								if( Negative_Money_Flow > 8253.57 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 899494 )
								ret := -0.600000
						if( MFI > 2.36424 )
							if( MFI <= 3.08469 )
								ret := 0.500000
							if( MFI > 3.08469 )
								ret := 0.250000
					if( VIM > 1.25826 )
						if( Money_Flow_Ratio <= 0.01599 )
							if( Negative_Money_Flow_Sum <= 731815 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 731815 )
								if( Raw_Money_Flow <= 225543 )
									ret := -0.142857
								if( Raw_Money_Flow > 225543 )
									ret := 0.500000
						if( Money_Flow_Ratio > 0.01599 )
							if( Negative_Money_Flow <= 271104 )
								if( VIP <= 0.555447 )
									ret := -0.750000 // sell
								if( VIP > 0.555447 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 271104 )
								ret := -0.571429
				if( Money_Flow_Ratio > 0.035585 )
					if( VIP_VIM <= -0.442358 )
						if( Raw_Money_Flow <= 353146 )
							if( Negative_Money_Flow_Sum <= 606788 )
								if( Raw_Money_Flow <= 17436.6 )
									ret := -0.266667
								if( Raw_Money_Flow > 17436.6 )
									ret := 0.456410
							if( Negative_Money_Flow_Sum > 606788 )
								if( Positive_Money_Flow_Sum <= 174142 )
									ret := -0.002801
								if( Positive_Money_Flow_Sum > 174142 )
									ret := 0.238462
						if( Raw_Money_Flow > 353146 )
							if( VIP <= 0.661388 )
								ret := 0.250000
							if( VIP > 0.661388 )
								if( VIP <= 0.748667 )
									ret := -0.909091 // sell
								if( VIP > 0.748667 )
									ret := -0.333333
					if( VIP_VIM > -0.442358 )
						if( Negative_Money_Flow_Sum <= 186498 )
							if( Negative_Money_Flow_Sum <= 179543 )
								if( Negative_Money_Flow_Sum <= 138692 )
									ret := -0.189873
								if( Negative_Money_Flow_Sum > 138692 )
									ret := -0.014286
							if( Negative_Money_Flow_Sum > 179543 )
								if( Negative_Money_Flow <= 50636.7 )
									ret := -0.266667
								if( Negative_Money_Flow > 50636.7 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 186498 )
							if( Typical_Price <= 1.9e-05 )
								if( Negative_Money_Flow_Sum <= 5.38576e+06 )
									ret := 0.092969
								if( Negative_Money_Flow_Sum > 5.38576e+06 )
									ret := 0.636364
							if( Typical_Price > 1.9e-05 )
								if( VIP <= 0.930306 )
									ret := 0.004000
								if( VIP > 0.930306 )
									ret := -0.647059
			if( Raw_Money_Flow > 367611 )
				if( Money_Flow_Ratio <= 0.129006 )
					if( Negative_Money_Flow <= 1.09806e+06 )
						if( Raw_Money_Flow <= 598186 )
							if( VIP_VIM <= -0.790648 )
								if( Positive_Money_Flow_Sum <= 89419.8 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 89419.8 )
									ret := -0.166667
							if( VIP_VIM > -0.790648 )
								if( VIP_VIM <= -0.365648 )
									ret := 0.676056
								if( VIP_VIM > -0.365648 )
									ret := -0.222222
						if( Raw_Money_Flow > 598186 )
							if( Typical_Price <= 1.4e-05 )
								if( Negative_Money_Flow_Sum <= 1.6685e+06 )
									ret := -0.238095
								if( Negative_Money_Flow_Sum > 1.6685e+06 )
									ret := 0.481481
							if( Typical_Price > 1.4e-05 )
								if( MFI_Low <= -12.1138 )
									ret := -0.410256
								if( MFI_Low > -12.1138 )
									ret := 0.266667
					if( Negative_Money_Flow > 1.09806e+06 )
						if( Positive_Money_Flow_Sum <= 86076.3 )
							if( Negative_Money_Flow_Sum <= 2.78835e+07 )
								ret := -0.600000
							if( Negative_Money_Flow_Sum > 2.78835e+07 )
								ret := 0.000000
						if( Positive_Money_Flow_Sum > 86076.3 )
							if( Typical_Price <= 3.1e-05 )
								if( VIM <= 1.12825 )
									ret := 0.285714
								if( VIM > 1.12825 )
									ret := 0.764331 // buy
							if( Typical_Price > 3.1e-05 )
								ret := -0.500000
				if( Money_Flow_Ratio > 0.129006 )
					if( Positive_Money_Flow <= 202122 )
						if( Raw_Money_Flow <= 2.05131e+06 )
							if( Positive_Money_Flow_Sum <= 617091 )
								if( VIP <= 0.750225 )
									ret := 0.294416
								if( VIP > 0.750225 )
									ret := 0.628959
							if( Positive_Money_Flow_Sum > 617091 )
								if( Money_Flow_Ratio <= 0.240318 )
									ret := 0.128617
								if( Money_Flow_Ratio > 0.240318 )
									ret := 0.337432
						if( Raw_Money_Flow > 2.05131e+06 )
							if( Negative_Money_Flow_Sum <= 1.70516e+07 )
								if( VIP_VIM <= -0.48578 )
									ret := 0.125000
								if( VIP_VIM > -0.48578 )
									ret := 0.761905 // buy
							if( Negative_Money_Flow_Sum > 1.70516e+07 )
								if( Positive_Money_Flow_Sum <= 8.32686e+06 )
									ret := 0.654709
								if( Positive_Money_Flow_Sum > 8.32686e+06 )
									ret := 0.304348
					if( Positive_Money_Flow > 202122 )
						if( MFI_High <= -64.4234 )
							ret := -1.000000 // sell
						if( MFI_High > -64.4234 )
							if( VIP_VIM <= -0.652508 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.652508 )
								if( Positive_Money_Flow_Sum <= 3.00881e+06 )
									ret := 0.428571
								if( Positive_Money_Flow_Sum > 3.00881e+06 )
									ret := -0.259259
		if( MFI > 22.8005 )
			if( Typical_Price <= 3.9e-05 )
				if( Positive_Money_Flow_Sum <= 1.56112e+08 )
					if( Negative_Money_Flow_Sum <= 1.24065e+08 )
						if( Positive_Money_Flow_Sum <= 5.01039e+07 )
							if( Positive_Money_Flow_Sum <= 3.54202e+07 )
								if( Negative_Money_Flow_Sum <= 3.78689e+07 )
									ret := 0.077929
								if( Negative_Money_Flow_Sum > 3.78689e+07 )
									ret := 0.379147
							if( Positive_Money_Flow_Sum > 3.54202e+07 )
								if( VIP_VIM <= 0.390657 )
									ret := 0.524691
								if( VIP_VIM > 0.390657 )
									ret := -0.121212
						if( Positive_Money_Flow_Sum > 5.01039e+07 )
							if( Typical_Price <= 2.2e-05 )
								if( VIM <= 0.885058 )
									ret := -0.846154 // sell
								if( VIM > 0.885058 )
									ret := -0.200000
							if( Typical_Price > 2.2e-05 )
								if( VIP <= 0.898057 )
									ret := -0.714286 // sell
								if( VIP > 0.898057 )
									ret := 0.030227
					if( Negative_Money_Flow_Sum > 1.24065e+08 )
						if( Negative_Money_Flow <= 2.2768e+07 )
							if( Typical_Price <= 3.5e-05 )
								if( Raw_Money_Flow <= 1.33678e+07 )
									ret := 0.812500 // buy
								if( Raw_Money_Flow > 1.33678e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 3.5e-05 )
								if( Positive_Money_Flow <= 4.75912e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 4.75912e+06 )
									ret := -0.333333
						if( Negative_Money_Flow > 2.2768e+07 )
							if( VIP_VIM <= -0.597152 )
								if( VIM <= 1.26338 )
									ret := 0.500000
								if( VIM > 1.26338 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.597152 )
								if( Negative_Money_Flow_Sum <= 2.09287e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.09287e+08 )
									ret := 0.500000
				if( Positive_Money_Flow_Sum > 1.56112e+08 )
					if( Raw_Money_Flow <= 2.55957e+07 )
						if( Typical_Price <= 3.7e-05 )
							if( Negative_Money_Flow_Sum <= 1.52337e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.52337e+08 )
								if( Negative_Money_Flow_Sum <= 1.92938e+08 )
									ret := 0.600000
								if( Negative_Money_Flow_Sum > 1.92938e+08 )
									ret := -1.000000 // sell
						if( Typical_Price > 3.7e-05 )
							if( MFI_High <= -25.0285 )
								ret := 1.000000 // buy
							if( MFI_High > -25.0285 )
								ret := -1.000000 // sell
					if( Raw_Money_Flow > 2.55957e+07 )
						if( VIP_VIM <= 0.535189 )
							if( MFI_Low <= 26.5248 )
								ret := 0.500000
							if( MFI_Low > 26.5248 )
								ret := 1.000000 // buy
						if( VIP_VIM > 0.535189 )
							ret := -0.500000
			if( Typical_Price > 3.9e-05 )
				if( Negative_Money_Flow_Sum <= 1.4501e+08 )
					if( Positive_Money_Flow_Sum <= 4.55883e+07 )
						ret := 0.600000
					if( Positive_Money_Flow_Sum > 4.55883e+07 )
						if( Negative_Money_Flow_Sum <= 4.05061e+07 )
							ret := 0.285714
						if( Negative_Money_Flow_Sum > 4.05061e+07 )
							if( Raw_Money_Flow <= 7.55121e+06 )
								if( Positive_Money_Flow_Sum <= 7.3332e+07 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 7.3332e+07 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 7.55121e+06 )
								if( Negative_Money_Flow_Sum <= 7.982e+07 )
									ret := -0.974359 // sell
								if( Negative_Money_Flow_Sum > 7.982e+07 )
									ret := -0.678571
				if( Negative_Money_Flow_Sum > 1.4501e+08 )
					if( Typical_Price <= 4.1e-05 )
						ret := 0.000000
					if( Typical_Price > 4.1e-05 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_SHIBUSDT_5Min_828ca0e2(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


