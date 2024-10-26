//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: U_1Min_2MV0_fdb1d6da Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2MV0_fdb1d6da", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_fdb1d6da(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIM <= 0.766626 )
		if( Positive_Money_Flow_Sum <= 1.33257e+07 )
			if( MFI_Low <= 47.0498 )
				if( Positive_Money_Flow_Sum <= 1.14962e+06 )
					if( VIP_VIM <= 0.653069 )
						if( MFI_High <= -14.2917 )
							if( MFI <= 60.5812 )
								if( VIP <= 1.25676 )
									ret := -0.322581
								if( VIP > 1.25676 )
									ret := 0.000000
							if( MFI > 60.5812 )
								if( Typical_Price <= 20.0862 )
									ret := -0.347826
								if( Typical_Price > 20.0862 )
									ret := -0.947368 // sell
						if( MFI_High > -14.2917 )
							ret := 0.285714
					if( VIP_VIM > 0.653069 )
						if( Positive_Money_Flow_Sum <= 429350 )
							if( Raw_Money_Flow <= 85785.6 )
								ret := 0.250000
							if( Raw_Money_Flow > 85785.6 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 429350 )
							if( Positive_Money_Flow_Sum <= 897772 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 897772 )
								ret := 0.200000
				if( Positive_Money_Flow_Sum > 1.14962e+06 )
					if( Negative_Money_Flow_Sum <= 1.5781e+06 )
						if( Money_Flow_Ratio <= 1.58483 )
							if( MFI_Low <= 40.9027 )
								if( Typical_Price <= 16.647 )
									ret := -0.054545
								if( Typical_Price > 16.647 )
									ret := 0.193548
							if( MFI_Low > 40.9027 )
								ret := -0.545455
						if( Money_Flow_Ratio > 1.58483 )
							if( Positive_Money_Flow <= 264709 )
								if( MFI_Low <= 42.3961 )
									ret := 0.574468
								if( MFI_Low > 42.3961 )
									ret := 0.226601
							if( Positive_Money_Flow > 264709 )
								if( Raw_Money_Flow <= 319534 )
									ret := 0.960000 // buy
								if( Raw_Money_Flow > 319534 )
									ret := 0.594203
					if( Negative_Money_Flow_Sum > 1.5781e+06 )
						if( Negative_Money_Flow_Sum <= 1.83353e+06 )
							if( Positive_Money_Flow_Sum <= 3.25183e+06 )
								if( MFI_High <= -24.1491 )
									ret := 0.217391
								if( MFI_High > -24.1491 )
									ret := -0.163934
							if( Positive_Money_Flow_Sum > 3.25183e+06 )
								if( Money_Flow_Ratio <= 1.90865 )
									ret := -0.916667 // sell
								if( Money_Flow_Ratio > 1.90865 )
									ret := -0.583333
						if( Negative_Money_Flow_Sum > 1.83353e+06 )
							if( Positive_Money_Flow_Sum <= 3.24368e+06 )
								if( VIM <= 0.747192 )
									ret := 0.321429
								if( VIM > 0.747192 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow_Sum > 3.24368e+06 )
								if( Negative_Money_Flow_Sum <= 5.90621e+06 )
									ret := 0.123028
								if( Negative_Money_Flow_Sum > 5.90621e+06 )
									ret := 0.490566
			if( MFI_Low > 47.0498 )
				if( Money_Flow_Ratio <= 4.62557 )
					if( Positive_Money_Flow_Sum <= 6.66036e+06 )
						if( Money_Flow_Ratio <= 3.1117 )
							if( MFI_Low <= 52.2119 )
								if( VIP_VIM <= 0.529578 )
									ret := -0.181416
								if( VIP_VIM > 0.529578 )
									ret := 0.062124
							if( MFI_Low > 52.2119 )
								if( Raw_Money_Flow <= 299029 )
									ret := 0.017794
								if( Raw_Money_Flow > 299029 )
									ret := 0.377095
						if( Money_Flow_Ratio > 3.1117 )
							if( MFI <= 76.4803 )
								if( Money_Flow_Ratio <= 3.24717 )
									ret := -0.298429
								if( Money_Flow_Ratio > 3.24717 )
									ret := -0.733333 // sell
							if( MFI > 76.4803 )
								if( Money_Flow_Ratio <= 3.39374 )
									ret := 0.302158
								if( Money_Flow_Ratio > 3.39374 )
									ret := -0.003871
					if( Positive_Money_Flow_Sum > 6.66036e+06 )
						if( VIP_VIM <= 0.977923 )
							if( Money_Flow_Ratio <= 2.10398 )
								if( Negative_Money_Flow <= 600844 )
									ret := 0.272727
								if( Negative_Money_Flow > 600844 )
									ret := 0.700000 // buy
							if( Money_Flow_Ratio > 2.10398 )
								if( Positive_Money_Flow_Sum <= 7.33138e+06 )
									ret := -0.726257 // sell
								if( Positive_Money_Flow_Sum > 7.33138e+06 )
									ret := -0.024390
						if( VIP_VIM > 0.977923 )
							ret := 0.588235
				if( Money_Flow_Ratio > 4.62557 )
					if( MFI_High <= 7.48022 )
						if( VIP_VIM <= 1.0361 )
							if( Negative_Money_Flow_Sum <= 1.44903e+06 )
								if( Typical_Price <= 16.2033 )
									ret := -0.038462
								if( Typical_Price > 16.2033 )
									ret := 0.299394
							if( Negative_Money_Flow_Sum > 1.44903e+06 )
								if( Typical_Price <= 20.8282 )
									ret := 0.178295
								if( Typical_Price > 20.8282 )
									ret := -0.632653
						if( VIP_VIM > 1.0361 )
							if( VIP <= 1.65815 )
								if( MFI_High <= 5.9425 )
									ret := 0.769231 // buy
								if( MFI_High > 5.9425 )
									ret := 1.000000 // buy
							if( VIP > 1.65815 )
								ret := -0.100000
					if( MFI_High > 7.48022 )
						if( VIP <= 1.69416 )
							if( Positive_Money_Flow_Sum <= 5.29226e+06 )
								if( Positive_Money_Flow_Sum <= 4.86312e+06 )
									ret := 0.046683
								if( Positive_Money_Flow_Sum > 4.86312e+06 )
									ret := 0.476190
							if( Positive_Money_Flow_Sum > 5.29226e+06 )
								if( Money_Flow_Ratio <= 42.5943 )
									ret := -0.307843
								if( Money_Flow_Ratio > 42.5943 )
									ret := 0.545455
						if( VIP > 1.69416 )
							if( VIP <= 1.88878 )
								if( Money_Flow_Ratio <= 13.4137 )
									ret := 0.727273 // buy
								if( Money_Flow_Ratio > 13.4137 )
									ret := 0.846154 // buy
							if( VIP > 1.88878 )
								ret := 0.235294
		if( Positive_Money_Flow_Sum > 1.33257e+07 )
			if( Negative_Money_Flow_Sum <= 1.61836e+07 )
				if( VIP_VIM <= 1.11258 )
					if( Typical_Price <= 20.6347 )
						if( Positive_Money_Flow_Sum <= 1.49534e+07 )
							if( Positive_Money_Flow_Sum <= 1.44695e+07 )
								if( Positive_Money_Flow <= 1.93398e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.93398e+06 )
									ret := 0.944444 // buy
							if( Positive_Money_Flow_Sum > 1.44695e+07 )
								ret := 0.777778 // buy
						if( Positive_Money_Flow_Sum > 1.49534e+07 )
							if( Positive_Money_Flow_Sum <= 2.13001e+07 )
								if( Money_Flow_Ratio <= 2.09239 )
									ret := 0.913043 // buy
								if( Money_Flow_Ratio > 2.09239 )
									ret := 0.091346
							if( Positive_Money_Flow_Sum > 2.13001e+07 )
								if( MFI_High <= -0.516602 )
									ret := 0.933333 // buy
								if( MFI_High > -0.516602 )
									ret := 0.576923
					if( Typical_Price > 20.6347 )
						if( Negative_Money_Flow_Sum <= 1.45012e+06 )
							if( Positive_Money_Flow_Sum <= 1.77677e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.77677e+07 )
								ret := 0.555556
						if( Negative_Money_Flow_Sum > 1.45012e+06 )
							if( Raw_Money_Flow <= 1.06211e+06 )
								if( Positive_Money_Flow_Sum <= 1.5952e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.5952e+07 )
									ret := -0.421053
							if( Raw_Money_Flow > 1.06211e+06 )
								if( Positive_Money_Flow <= 5.61531e+06 )
									ret := 0.098160
								if( Positive_Money_Flow > 5.61531e+06 )
									ret := -0.941176 // sell
				if( VIP_VIM > 1.11258 )
					ret := -0.800000 // sell
			if( Negative_Money_Flow_Sum > 1.61836e+07 )
				if( Negative_Money_Flow <= 3.41057e+06 )
					if( Positive_Money_Flow <= 62923.9 )
						ret := -0.600000
					if( Positive_Money_Flow > 62923.9 )
						if( MFI <= 64.9684 )
							ret := -0.888889 // sell
						if( MFI > 64.9684 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow > 3.41057e+06 )
					ret := 0.625000
	if( VIM > 0.766626 )
		if( Negative_Money_Flow <= 43.5298 )
			if( VIP_VIM <= 0.48758 )
				if( VIM <= 1.68313 )
					if( VIM <= 0.927488 )
						if( MFI_High <= -29.6599 )
							if( MFI <= 30.3969 )
								if( VIP_VIM <= 0.35353 )
									ret := -0.769231 // sell
								if( VIP_VIM > 0.35353 )
									ret := 0.076923
							if( MFI > 30.3969 )
								if( Raw_Money_Flow <= 172728 )
									ret := 0.068100
								if( Raw_Money_Flow > 172728 )
									ret := 0.274953
						if( MFI_High > -29.6599 )
							if( Money_Flow_Ratio <= 1.18142 )
								if( MFI_High <= -27.2066 )
									ret := -0.046012
								if( MFI_High > -27.2066 )
									ret := -0.352697
							if( Money_Flow_Ratio > 1.18142 )
								if( VIM <= 0.922144 )
									ret := -0.001417
								if( VIM > 0.922144 )
									ret := 0.244186
					if( VIM > 0.927488 )
						if( Negative_Money_Flow_Sum <= 206241 )
							if( Raw_Money_Flow <= 194095 )
								if( Positive_Money_Flow <= 5527.85 )
									ret := -0.129151
								if( Positive_Money_Flow > 5527.85 )
									ret := -0.404959
							if( Raw_Money_Flow > 194095 )
								if( Money_Flow_Ratio <= 5.35586 )
									ret := 0.933333 // buy
								if( Money_Flow_Ratio > 5.35586 )
									ret := -0.033333
						if( Negative_Money_Flow_Sum > 206241 )
							if( VIM <= 1.36319 )
								if( MFI <= 59.5193 )
									ret := -0.062374
								if( MFI > 59.5193 )
									ret := 0.060520
							if( VIM > 1.36319 )
								if( Positive_Money_Flow_Sum <= 3.57653e+06 )
									ret := 0.198332
								if( Positive_Money_Flow_Sum > 3.57653e+06 )
									ret := -0.336066
				if( VIM > 1.68313 )
					if( Positive_Money_Flow <= 1653.04 )
						if( Raw_Money_Flow <= 38114.1 )
							if( Positive_Money_Flow_Sum <= 42011.3 )
								if( VIM <= 15.4506 )
									ret := 0.252294
								if( VIM > 15.4506 )
									ret := -0.093750
							if( Positive_Money_Flow_Sum > 42011.3 )
								if( Negative_Money_Flow_Sum <= 20121.9 )
									ret := 0.652174
								if( Negative_Money_Flow_Sum > 20121.9 )
									ret := 0.018311
						if( Raw_Money_Flow > 38114.1 )
							if( MFI_Low <= 20.2577 )
								if( VIP <= 4.91144 )
									ret := -0.500000
								if( VIP > 4.91144 )
									ret := 0.750000 // buy
							if( MFI_Low > 20.2577 )
								if( VIP_VIM <= 0.055066 )
									ret := -0.428571
								if( VIP_VIM > 0.055066 )
									ret := -0.869565 // sell
					if( Positive_Money_Flow > 1653.04 )
						if( MFI <= 24.0057 )
							if( Raw_Money_Flow <= 7652.96 )
								if( Negative_Money_Flow_Sum <= 91946.4 )
									ret := 0.581395
								if( Negative_Money_Flow_Sum > 91946.4 )
									ret := -0.218362
							if( Raw_Money_Flow > 7652.96 )
								if( Money_Flow_Ratio <= 0.263142 )
									ret := 0.094340
								if( Money_Flow_Ratio > 0.263142 )
									ret := 0.384615
						if( MFI > 24.0057 )
							if( VIP <= 1.45707 )
								if( Typical_Price <= 16.2591 )
									ret := 0.611111
								if( Typical_Price > 16.2591 )
									ret := 0.007874
							if( VIP > 1.45707 )
								if( Negative_Money_Flow_Sum <= 106807 )
									ret := -0.173389
								if( Negative_Money_Flow_Sum > 106807 )
									ret := -0.322886
			if( VIP_VIM > 0.48758 )
				if( Positive_Money_Flow <= 204698 )
					if( MFI_High <= -31.567 )
						if( MFI_High <= -34.8706 )
							if( VIP_VIM <= 0.679187 )
								if( Typical_Price <= 16.0417 )
									ret := 0.500000
								if( Typical_Price > 16.0417 )
									ret := -0.067010
							if( VIP_VIM > 0.679187 )
								if( Negative_Money_Flow_Sum <= 52822.3 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 52822.3 )
									ret := -0.220339
						if( MFI_High > -34.8706 )
							if( VIP <= 3.96976 )
								if( VIM <= 2.51833 )
									ret := 0.764706 // buy
								if( VIM > 2.51833 )
									ret := 0.181818
							if( VIP > 3.96976 )
								if( Typical_Price <= 16.7347 )
									ret := 0.416667
								if( Typical_Price > 16.7347 )
									ret := -0.227273
					if( MFI_High > -31.567 )
						if( MFI_Low <= 41.2199 )
							if( VIP <= 3.95866 )
								if( Positive_Money_Flow_Sum <= 272290 )
									ret := -0.741313 // sell
								if( Positive_Money_Flow_Sum > 272290 )
									ret := -0.107143
							if( VIP > 3.95866 )
								if( Positive_Money_Flow_Sum <= 37056.2 )
									ret := -0.935484 // sell
								if( Positive_Money_Flow_Sum > 37056.2 )
									ret := -0.306859
						if( MFI_Low > 41.2199 )
							if( Raw_Money_Flow <= 2904.95 )
								if( MFI_High <= -16.6407 )
									ret := 0.695652
								if( MFI_High > -16.6407 )
									ret := -0.044944
							if( Raw_Money_Flow > 2904.95 )
								if( Positive_Money_Flow <= 17.9602 )
									ret := 0.016892
								if( Positive_Money_Flow > 17.9602 )
									ret := -0.318598
				if( Positive_Money_Flow > 204698 )
					if( VIM <= 0.907835 )
						if( MFI_High <= -8.57292 )
							if( VIP <= 1.31826 )
								if( Positive_Money_Flow <= 351357 )
									ret := 0.960000 // buy
								if( Positive_Money_Flow > 351357 )
									ret := 0.291667
							if( VIP > 1.31826 )
								ret := -0.066667
						if( MFI_High > -8.57292 )
							if( VIM <= 0.771748 )
								if( Positive_Money_Flow <= 464687 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow > 464687 )
									ret := 0.166667
							if( VIM > 0.771748 )
								if( Money_Flow_Ratio <= 12.9647 )
									ret := -0.382166
								if( Money_Flow_Ratio > 12.9647 )
									ret := 0.365854
					if( VIM > 0.907835 )
						if( MFI_High <= 15.8272 )
							if( MFI_Low <= 62.7485 )
								ret := -0.250000
							if( MFI_Low > 62.7485 )
								if( VIM <= 1.98293 )
									ret := 0.852459 // buy
								if( VIM > 1.98293 )
									ret := -0.300000
						if( MFI_High > 15.8272 )
							if( Positive_Money_Flow_Sum <= 3.46915e+06 )
								ret := 0.529412
							if( Positive_Money_Flow_Sum > 3.46915e+06 )
								ret := -0.857143 // sell
		if( Negative_Money_Flow > 43.5298 )
			if( Negative_Money_Flow_Sum <= 346454 )
				if( MFI_Low <= -2.90526 )
					if( VIP_VIM <= -0.027686 )
						if( VIP <= 11.785 )
							if( Positive_Money_Flow <= 195.322 )
								if( Raw_Money_Flow <= 14872 )
									ret := 0.649733
								if( Raw_Money_Flow > 14872 )
									ret := 0.456583
							if( Positive_Money_Flow > 195.322 )
								if( VIP_VIM <= -1.41764 )
									ret := 0.857143 // buy
								if( VIP_VIM > -1.41764 )
									ret := -0.185185
						if( VIP > 11.785 )
							if( Negative_Money_Flow <= 18153 )
								if( MFI_High <= -68.1481 )
									ret := -0.250000
								if( MFI_High > -68.1481 )
									ret := -0.777778 // sell
							if( Negative_Money_Flow > 18153 )
								ret := 0.363636
					if( VIP_VIM > -0.027686 )
						if( MFI_High <= -65.371 )
							if( MFI_Low <= -5.9798 )
								if( Negative_Money_Flow_Sum <= 217379 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 217379 )
									ret := -0.200000
							if( MFI_Low > -5.9798 )
								ret := 0.500000
						if( MFI_High > -65.371 )
							if( Negative_Money_Flow_Sum <= 191613 )
								ret := 0.062500
							if( Negative_Money_Flow_Sum > 191613 )
								if( Typical_Price <= 20.6128 )
									ret := -0.100000
								if( Typical_Price > 20.6128 )
									ret := -1.000000 // sell
				if( MFI_Low > -2.90526 )
					if( VIP <= 1.55495 )
						if( MFI <= 73.6779 )
							if( Negative_Money_Flow_Sum <= 260288 )
								if( VIP_VIM <= -0.406838 )
									ret := 0.466899
								if( VIP_VIM > -0.406838 )
									ret := 0.183239
							if( Negative_Money_Flow_Sum > 260288 )
								if( MFI_Low <= 2.73941 )
									ret := -0.058824
								if( MFI_Low > 2.73941 )
									ret := 0.568396
						if( MFI > 73.6779 )
							if( Negative_Money_Flow_Sum <= 29886 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 29886 )
								if( Money_Flow_Ratio <= 3.8669 )
									ret := -0.333333
								if( Money_Flow_Ratio > 3.8669 )
									ret := 0.006329
					if( VIP > 1.55495 )
						if( VIP_VIM <= -0.014111 )
							if( MFI_High <= -21.9204 )
								if( Negative_Money_Flow_Sum <= 202538 )
									ret := 0.210200
								if( Negative_Money_Flow_Sum > 202538 )
									ret := -0.083770
							if( MFI_High > -21.9204 )
								if( MFI_Low <= 49.0381 )
									ret := 0.495370
								if( MFI_Low > 49.0381 )
									ret := 0.212042
						if( VIP_VIM > -0.014111 )
							if( MFI_High <= -36.7103 )
								if( Typical_Price <= 17.1911 )
									ret := -0.197007
								if( Typical_Price > 17.1911 )
									ret := 0.079096
							if( MFI_High > -36.7103 )
								if( MFI <= 48.2509 )
									ret := 0.320113
								if( MFI > 48.2509 )
									ret := 0.113852
			if( Negative_Money_Flow_Sum > 346454 )
				if( Negative_Money_Flow_Sum <= 7.97239e+06 )
					if( Negative_Money_Flow <= 5931.4 )
						if( VIP_VIM <= 0.12565 )
							if( MFI_Low <= -12.3319 )
								if( VIM <= 8.6964 )
									ret := 0.906250 // buy
								if( VIM > 8.6964 )
									ret := 0.444444
							if( MFI_Low > -12.3319 )
								if( Positive_Money_Flow <= 3050.29 )
									ret := 0.247619
								if( Positive_Money_Flow > 3050.29 )
									ret := -0.229730
						if( VIP_VIM > 0.12565 )
							if( MFI_High <= 9.18707 )
								if( VIP_VIM <= 0.302877 )
									ret := 0.755814 // buy
								if( VIP_VIM > 0.302877 )
									ret := 0.049383
							if( MFI_High > 9.18707 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow > 5931.4 )
						if( VIP <= 1.75158 )
							if( MFI_Low <= 16.9274 )
								if( MFI_Low <= -0.017585 )
									ret := 0.016719
								if( MFI_Low > -0.017585 )
									ret := -0.083952
							if( MFI_Low > 16.9274 )
								if( Positive_Money_Flow_Sum <= 2.22759e+06 )
									ret := -0.039362
								if( Positive_Money_Flow_Sum > 2.22759e+06 )
									ret := 0.027325
						if( VIP > 1.75158 )
							if( Money_Flow_Ratio <= 0.14058 )
								if( Negative_Money_Flow <= 2.61617e+06 )
									ret := -0.188235
								if( Negative_Money_Flow > 2.61617e+06 )
									ret := 0.947368 // buy
							if( Money_Flow_Ratio > 0.14058 )
								if( MFI_Low <= -2.78877 )
									ret := 0.872340 // buy
								if( MFI_Low > -2.78877 )
									ret := 0.305263
				if( Negative_Money_Flow_Sum > 7.97239e+06 )
					if( Positive_Money_Flow_Sum <= 2.0919e+07 )
						if( Negative_Money_Flow <= 1.25505e+07 )
							if( Typical_Price <= 20.4073 )
								if( Positive_Money_Flow_Sum <= 84781.6 )
									ret := -0.531250
								if( Positive_Money_Flow_Sum > 84781.6 )
									ret := 0.241161
							if( Typical_Price > 20.4073 )
								if( MFI_High <= -31.3071 )
									ret := -0.040279
								if( MFI_High > -31.3071 )
									ret := 0.582915
						if( Negative_Money_Flow > 1.25505e+07 )
							if( MFI_Low <= 3.25051 )
								if( MFI_Low <= -10.5103 )
									ret := 0.750000 // buy
								if( MFI_Low > -10.5103 )
									ret := 0.957447 // buy
							if( MFI_Low > 3.25051 )
								ret := 0.647059
					if( Positive_Money_Flow_Sum > 2.0919e+07 )
						if( Positive_Money_Flow_Sum <= 2.99311e+07 )
							if( MFI <= 72.5803 )
								if( Raw_Money_Flow <= 478548 )
									ret := -0.377358
								if( Raw_Money_Flow > 478548 )
									ret := -0.872000 // sell
							if( MFI > 72.5803 )
								ret := 0.666667
						if( Positive_Money_Flow_Sum > 2.99311e+07 )
							if( Positive_Money_Flow <= 46962.1 )
								if( VIP_VIM <= 0.011066 )
									ret := 0.840909 // buy
								if( VIP_VIM > 0.011066 )
									ret := 0.363636
							if( Positive_Money_Flow > 46962.1 )
								if( Money_Flow_Ratio <= 1.8043 )
									ret := -0.866667 // sell
								if( Money_Flow_Ratio > 1.8043 )
									ret := 0.181818
	
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
float op_operation = decision_tree_0_U_1Min_fdb1d6da(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)

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


